package io.practise.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/responseMessage")
	public String responseMessage() {
		return "Hey.. This is the response";
	}
	
}
