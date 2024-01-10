package com.apiteste.apiteste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class ApiTesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiTesteApplication.class, args);
	}
	@GetMapping("/hello")
	public String Hello() {

		return	"Hello World!";

	}
}
