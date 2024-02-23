package com.git.ex02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ex02Application {
	public static void main(String[] args) {
		//SpringApplication.run(Ex02Application.class, args);

		ApplicationContext context = SpringApplication.run(Ex02Application.class);

		String[] arr = context.getBeanDefinitionNames();

		for(String s : arr) {
			System.out.println(s);
		}
	}
}
