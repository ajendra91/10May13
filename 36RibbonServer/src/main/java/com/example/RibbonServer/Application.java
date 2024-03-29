package com.example.RibbonServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

	@RequestMapping("/hello/{name}")
	public String chat(@PathVariable String name) {
		return "welcome"+name;
	}

}
