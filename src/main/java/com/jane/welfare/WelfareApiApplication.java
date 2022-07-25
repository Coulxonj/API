package com.jane.welfare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class WelfareApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WelfareApiApplication.class, args);
	}

}
														