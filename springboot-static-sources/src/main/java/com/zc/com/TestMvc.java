package com.zc.com;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMvc implements springbootcontroller {
	
	@Resource
	private TestServiceIn service;

	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String testMvc() {
		/*try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		service.test();
		return "helloworld+1";
	}
	
	
}
