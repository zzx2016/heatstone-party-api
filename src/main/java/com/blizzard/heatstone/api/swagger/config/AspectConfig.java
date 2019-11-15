package com.blizzard.heatstone.api.swagger.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 *  拦截com.blizzard.heatstone.api包中的方法
 *  Created by cc on 16-6-6.
 */
@Aspect
@Component
public class AspectConfig {
    //private static final Logger logger = LoggerFactory.getLogger(AspectConfig.class);

    //存放拦截类和实现类的对应关系
    private static final Map<Signature, BeanMethod> cache = new HashMap<>();

    @Autowired
    private ConfigurableApplicationContext context;

    /**
     * 拦截所有 org.cc.test 包内类的方法
     *
     * @param jp
     * @return
     * @throws Throwable
     */
    @Around("execution(public * com.blizzard.heatstone.api.swagger.api.*Controller.*(..))")
    public Object process(ProceedingJoinPoint jp) throws Throwable {
        //logger.debug("拦截方法所属的类型:[" + jp.getSignature().getDeclaringType() + "]");
        //logger.debug("拦截方法名称:[" + jp.getSignature().getName() + "]");
        //logger.debug("拦截方法参数:[" + jp.getArgs() + "]");
        BeanMethod beanMethod = cache.get(jp.getSignature());
        if (beanMethod == null) {
            //logger.debug("缓存中取得方法:[" + jp.getSignature() + "]");
            //通过@Service(value="com.wk.p3.name.api.PetApi"),找到拦截方法对应的实现类
            Object bean = context.getBean(jp.getSignature().getDeclaringType().getName());
            //找到拦截方法对应的实现方法method
            Method method = getMethod(bean, jp.getSignature());
            if (bean != null && method != null) {
                //准备走拦截类外部实现的方法
                beanMethod = new BeanMethod(bean, method);
                cache.put(jp.getSignature(), beanMethod);
            } else {
                //logger.debug("不走拦截后的外部实现方法:[" + jp.getSignature() + "]");
                //调用拦截类本身的方法
                return jp.proceed(jp.getArgs());
            }
        }
        Object re = beanMethod.invoke(jp.getArgs());
        //logger.debug("拦截方法后返回值:[" + re.toString() + "]");
        return re;
    }

    /**
     * 找到bean中有相同signature的方法
     * @param bean
     * @param signature
     * @return
     */
    private Method getMethod(Object bean, Signature signature) {
        Method[] methods = bean.getClass().getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            //找出方法名同的方法,且参数类型个数一致
            if (signature.getName().equals(methods[i].getName()) //方法名称一致
                    && shortString(methods[i].toString()).equals(shortString(signature.toLongString())) //方法类参数类型一致
                    ) {
                return methods[i];
            }
        }
        return null;
    }

    /**
     * 将字符串
     * public org.springframework.http.ResponseEntity com.wk.p3.name.service.PetApi_impl.findPetsByTags(java.util.List) throws com.wk.p3.name.api.NotFoundException
     * 转换为
     * (java.util.List)
     *
     * @return
     */
    private String shortString(String str) {
        int f = str.indexOf("(");
        int t = str.indexOf(")");
        if (f > 0 && t > f) {
            return str.substring(f, t);
        } else {
            return "";
        }
    }

    private static class BeanMethod {
        Method method = null;
        Object bean = null;

        public BeanMethod(Object bean, Method method) {
            this.method = method;
            this.bean = bean;
        }

        private Object invoke(Object[] args) throws InvocationTargetException, IllegalAccessException {
            return method.invoke(bean, args);
        }
    }


}
