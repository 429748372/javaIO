package com.zc.com;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.FileUrlResource;
import org.springframework.core.io.Resource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootStaticSourcesApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void contentLength() throws MalformedURLException{
		Resource source = new FileUrlResource("C:\\Users\\Administrator.USER01607241059\\Desktop\\112844.wmv");
		//Resource source  = new FileSystemResource(new File("C:\\Users\\Administrator.USER01607241059\\Desktop\\112844.wmv"));
		try {
			System.out.println(source.contentLength());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
