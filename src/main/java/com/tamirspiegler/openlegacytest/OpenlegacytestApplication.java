package com.tamirspiegler.openlegacytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class OpenlegacytestApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenlegacytestApplication.class, args);
	}

}
