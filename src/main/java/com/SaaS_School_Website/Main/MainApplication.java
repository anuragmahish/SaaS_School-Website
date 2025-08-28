package com.SaaS_School_Website.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {

        //SpringApplication.run(MainApplication.class, args);

        System.out.println("Running1");
        System.out.println("Running3");
        int a = 10;
        int b = 20;
        int c = a+b;

        System.out.println(c);
	}

}
