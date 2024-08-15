package com.example.RestServiceApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
@RequestMapping("/test")
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

	@GetMapping()
	public String test(){
		return "Server is Running and test ok";
	}
}
