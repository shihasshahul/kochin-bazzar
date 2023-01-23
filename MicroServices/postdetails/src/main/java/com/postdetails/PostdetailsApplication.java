package com.postdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class PostdetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostdetailsApplication.class, args);
	}

}
