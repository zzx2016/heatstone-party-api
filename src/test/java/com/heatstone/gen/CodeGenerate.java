package com.heatstone.gen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.maven.model.Model;
import org.junit.Test;

/**
 * 生成swagger代码的工具类方法
 */
public class CodeGenerate {

    /**
     * 生成服务端代码
     * 生成代码后已经copy到src目录,一般情况下不用依赖jar包使用
     */
    @Test
    public void GenerateServerProject() {
        Model model = SwaggerUtils.getPomModel();
        String artifactId = "swagger-api-server";
        String artifactVersion = model.getVersion();
        String groupId = model.getGroupId();
        /*
            1.生成项目同时将生成的代码copy到项目中
        */
        SwaggerUtils.genServer(groupId, artifactId, artifactVersion);
        replaceJodaDate();
        addCustomApiToSwagger();
    }

    /**
     * 生成springCloud客户端代码
     * 可以按照注解步骤发布到maven中依赖使用
     */
//    @Test
    public void GenerateForSpringCloudClient() {
        Model model = SwaggerUtils.getPomModel();
        String artifactId = "swagger-api-cloud-client";
        String artifactVersion = model.getVersion();
        String groupId = model.getGroupId();
        /*
            1.生成项目
         */
        SwaggerUtils.generateForSpringCloudClient(groupId, artifactId, artifactVersion);
        /*
            2.发布项目
            切换到bin/client 目录下执行
            将服务端安装到本地maven仓库  mvn clean install
            将服务端安发布到maven私服    mvn --settings ../settings.xml clean install deploy -DaltDeploymentRepository=snapshots::default::http://bogon:8081/nexus/content/repositories/releases
         */
    }

    /**
     * 生成客户端代码
     * 用于单独使用feign客户端调用
     * 可以按照注解步骤发布到maven中依赖使用
     */
//    @Test
    public void GenerateClientProject() {
        Model model = SwaggerUtils.getPomModel();
        String artifactId = "swagger-api-client";
        String artifactVersion = model.getVersion();
        String groupId = model.getGroupId();
        /*
            1.生成项目
         */
        SwaggerUtils.genClient(groupId, artifactId, artifactVersion);
        /*
            2.发布项目
            切换到bin/client 目录下执行
            将服务端安装到本地maven仓库  mvn clean install
            将服务端安发布到maven私服    mvn --settings ../settings.xml clean install deploy -DaltDeploymentRepository=snapshots::default::http://bogon:8081/nexus/content/repositories/releases
         */
    }
    
    private void replaceJodaDate(){
    	File root = new File("src/main/java/com/blizzard/heatstone/api/swagger/model");
        if(root.exists()){
        	System.out.println("############## model ##############");
        	File[] files = root.listFiles();
        	for(File file : files){
        		System.out.println("file name : " + file.getName());
        		try {
        			StringBuilder content = new StringBuilder();
        			BufferedReader br = new BufferedReader(new FileReader(file));
                    String line = null;
                    while((line = br.readLine())!=null){
                    	content.append(System.lineSeparator() + line);
                    }
                    br.close();
					FileWriter fw = new FileWriter(file);
					fw.write(content.toString().replaceAll("org.joda.time.DateTime", "java.util.Date").replaceAll("DateTime", "Date"));
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
        	}
        }
        root = new File("src/main/java/com/blizzard/heatstone/api/swagger/api");
        if(root.exists()){
        	System.out.println("############## api ##############");
        	File[] files = root.listFiles();
        	for(File file : files){
        		System.out.println("file name : " + file.getName());
        		try {
        			StringBuilder content = new StringBuilder();
        			BufferedReader br = new BufferedReader(new FileReader(file));
                    String line = null;
                    while((line = br.readLine())!=null){
                    	content.append(System.lineSeparator() + line);
                    }
                    br.close();
					FileWriter fw = new FileWriter(file);
					fw.write(content.toString().replaceAll("org.joda.time.DateTime", "java.util.Date").replaceAll("DateTime", "Date"));
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
        	}
        }
    }
    
    private void addCustomApiToSwagger(){
    	File file = new File("src/main/java/com/blizzard/heatstone/api/swagger/config/SwaggerDocumentationConfig.java");
    	if(file.exists()){
    		System.out.println("############################");
    		try {
    			StringBuilder content = new StringBuilder();
    			BufferedReader br = new BufferedReader(new FileReader(file));
                String line = null;
                while((line = br.readLine())!=null){
                	content.append(System.lineSeparator() + line);
                }
                br.close();
				FileWriter fw = new FileWriter(file);
				fw.write(content.toString().replaceAll("RequestHandlerSelectors.basePackage\\(\"com.blizzard.heatstone.api.swagger.api\"\\)", "RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)").replaceAll("swagger.config;", "swagger.config;\nimport io.swagger.annotations.ApiOperation;"));
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    }

}

