package com.blizzard.heatstone.api.qiniu;

import java.io.File;
import java.util.HashMap;
import java.util.Map;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.blizzard.heatstone.api.enums.ApiStatus;
import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;

@Component
public class QiNiuHelper {
	
	private static Logger log = LoggerFactory.getLogger(QiNiuHelper.class);
	
	@Autowired
	private QiNiuConfig qiNiuConfig;
	
	private static Auth auth;
	
	private static String token;
	
	private static UploadManager uploadManager;
	
	/**
	 * 简单上传
	 * @param path  本地文件的路径
	 * @param fileName	上传到服务器上的文件名
	 * @return
	 */
	public Map<String,Object> simpleUpload(String path ,String fileName){
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			String upToken = getToken();
			UploadManager uploadManager = getUploadManager();
			Response response =  uploadManager.put(path, fileName, upToken);
			if(response.isOK()){
				DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
				map.put("key", putRet.key);
				map.put("hash", putRet.hash);
				map.put("status", ApiStatus.SUCCESS.getCode());
				map.put("msg", ApiStatus.SUCCESS.getMessage());
			}else{
				map.put("status", ApiStatus.FAIL.getCode());
				map.put("msg", ApiStatus.FAIL.getMessage());
			}
			
		} catch (QiniuException  e) {
			Response r = e.response;
			try {
				log.error("simple upload error :" + r.bodyString());
			} catch (QiniuException e1) {
				e1.printStackTrace();
			}
			map.put("status", ApiStatus.ERROR.getCode());
			map.put("msg", ApiStatus.ERROR.getMessage());
		}
		return map;
	}
   
	
	private Auth getAuth(){
		
		if(auth == null){
			auth = Auth.create(qiNiuConfig.getAccessKey(), qiNiuConfig.getSecretKey());
		}
		return auth;
		
	}
	
	private String getToken(){
		
		if(token == null){
			token = getAuth().uploadToken(qiNiuConfig.getBucketName());
		}
		return token;
		
	}
	
	private UploadManager getUploadManager() {

		if(uploadManager == null){
			uploadManager = new UploadManager(new Configuration(Zone.autoZone()));
		}
		return uploadManager;
	}
	

}
