package com.example.demo;

import com.example.demo.controller.Bank7Pro;

import com.example.demo.utility.thread.ThreadTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		Thread t1 = new Thread(new ThreadTest());

		t1. start();

		SpringApplication.run(DemoApplication.class, args);
	}
}
