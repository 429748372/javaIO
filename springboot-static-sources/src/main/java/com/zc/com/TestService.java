package com.zc.com;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TestService implements TestServiceIn{
	
	@Async
	public void test(){
		try {
			Thread.sleep(60000);
			System.out.println("************************");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
