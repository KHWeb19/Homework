package com.example.demo;

import com.example.demo.thread.ThreadWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ThreadWorker tw=new ThreadWorker();
		tw.start();				//join은 필요없음


	}

}
