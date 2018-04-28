package com.zc.com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMvc implements springbootcontroller {

	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String testMvc() {
		return "helloworld";
	}

}
