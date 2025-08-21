package com.shivaniscode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyDashBApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyDashBApplication.class, args);
	}

//	@GetMapping
//	public String HelloWorld(){
//		return "Hello World Spring boot";
//	}
}
