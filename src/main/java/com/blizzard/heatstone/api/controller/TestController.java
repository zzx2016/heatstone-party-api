package com.blizzard.heatstone.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayOpenPublicTemplateMessageIndustryModifyRequest;
import com.alipay.api.response.AlipayOpenPublicTemplateMessageIndustryModifyResponse;
import com.blizzard.heatstone.api.qiniu.QiNiuConfig;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private QiNiuConfig qiNiuConfig;
	
	@Value("${com.koubei.appid}")
	private String APP_ID;
	@Value("${com.koubei.app_private_key}")
	private String APP_PRIVATE_KEY;
	@Value("${com.koubei.chatset}")
	private String CHARSET;
	@Value("${com.koubei.alipay_public_key}")
	private String ALIPAY_PUBLIC_KEY;

	@RequestMapping("/test")
	@ResponseBody
	public String hello() throws AlipayApiException {
		//实例化客户端
		AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipay.com/gateway.do", APP_ID, APP_PRIVATE_KEY, "json", CHARSET, ALIPAY_PUBLIC_KEY, "RSA2");
		//实例化具体API对应的request类,类名称和接口名称对应,当前调用接口名称：alipay.open.public.template.message.industry.modify 
		AlipayOpenPublicTemplateMessageIndustryModifyRequest request = new AlipayOpenPublicTemplateMessageIndustryModifyRequest();
		//SDK已经封装掉了公共参数，这里只需要传入业务参数
		//此次只是参数展示，未进行字符串转义，实际情况下请转义
		request.setBizContent("  {" +
		"    \"primary_industry_name\":\"IT科技/IT软件与服务\"," +
		"    \"primary_industry_code\":\"10001/20102\"," +
		"    \"secondary_industry_code\":\"10001/20102\"," +
		"    \"secondary_industry_name\":\"IT科技/IT软件与服务\"" +
		" }");
		AlipayOpenPublicTemplateMessageIndustryModifyResponse response = alipayClient.execute(request); 
		//调用成功，则处理业务逻辑
		System.out.println(response);
		if(response.isSuccess()){
		    //.....
			return response.getBody();
		}
		return "";
	}
	
	@RequestMapping("/config")
	@ResponseBody
	public String getConfiguration(){
		
		return qiNiuConfig.toString();
		
	}

}
