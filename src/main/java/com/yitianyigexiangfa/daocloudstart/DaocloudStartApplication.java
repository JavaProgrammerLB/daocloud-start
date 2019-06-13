package com.yitianyigexiangfa.daocloudstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DaocloudStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaocloudStartApplication.class, args);
	}

	@GetMapping("/hi")
	public String hi(){
		return "Hi";
	}

}
