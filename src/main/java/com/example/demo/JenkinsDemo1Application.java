package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsDemo1Application {

	@GetMapping("/")
	public String home()
	{
		return "Hello world by jag";
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemo1Application.class, args);
		System.out.println("Jag: The spring boot app jenkins-demo-1 is running fine");
	}

}
