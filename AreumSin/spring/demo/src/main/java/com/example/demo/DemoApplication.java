package com.example.demo;

import com.example.demo.utility.thread.ThreadWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) { // javaSpring은 Thread로 구성되어 있다.
		ThreadWorker tw = new ThreadWorker();
		tw.start();

		SpringApplication.run(DemoApplication.class, args);
	}

}
