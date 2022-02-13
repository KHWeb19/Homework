package com.example.homework;

import com.example.homework.utility.Thread.ThreadWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HomeworkApplication {

	public static void main(String[] args) {
		ThreadWorker tw = new ThreadWorker();
		tw.start();

		SpringApplication.run(HomeworkApplication.class, args);
	}

}
