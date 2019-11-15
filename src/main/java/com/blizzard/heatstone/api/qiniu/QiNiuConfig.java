package com.blizzard.heatstone.api.qiniu;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "com.qiniu.storage")
public class QiNiuConfig {
	
	private String accessKey;
	
	private String secretKey;
	
	private String domain;
	
	private String bucketName;

	public String getAccessKey() {
		return accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getBucketName() {
		return bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	@Override
	public String toString() {
		return "QiNiuConfig [accessKey=" + accessKey + ", secretKey=" + secretKey + ", domain=" + domain
				+ ", bucketName=" + bucketName + "]";
	}

}
