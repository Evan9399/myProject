package com.project.sake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.project.sake")
public class MysakeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysakeApplication.class, args);
	}

}
