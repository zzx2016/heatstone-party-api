package com.heatstone.upload;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.blizzard.heatstone.api.Application;
import com.blizzard.heatstone.api.qiniu.QiNiuHelper;


@RunWith(SpringJUnit4ClassRunner.class)  
@SpringApplicationConfiguration(classes = Application.class)  
@WebAppConfiguration 
public class uploadTest {

	@Autowired
	private QiNiuHelper qiNiuHelper;
	
	@Test
	public void simpleUpload() {
				
		System.out.println(qiNiuHelper.simpleUpload("D:\\qrcode.jpg", "\test.png"));
	   
	}
	
}
