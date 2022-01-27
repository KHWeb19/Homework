package com.example.demo;

import com.example.demo.utility.nomal.Student;
import com.example.demo.utility.thread.GeometricProgression;
import com.example.demo.utility.thread.ThreadManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ThreadManager tm = new ThreadManager();
		tm.start();

		GeometricProgression gp = new GeometricProgression();
		gp.start();

		SpringApplication.run(DemoApplication.class, args);
	}

}
