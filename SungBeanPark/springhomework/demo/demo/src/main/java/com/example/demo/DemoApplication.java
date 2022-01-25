package com.example.demo;

import com.example.demo.controller.Homework2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) throws Exception {SpringApplication.run(DemoApplication.class, args);
		Homework2 myThread = new Homework2();
		myThread.start();
	}
}
