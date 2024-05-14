package com.Just.Hello_World;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {
	
	private String name;
	private int age;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		System.out.println("my name is :"+name);
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		System.out.println("my age is :"+age);
		this.age = age;
	}


	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
		HelloWorldApplication h = new HelloWorldApplication();
		h.setName("Harikaran");
		h.setAge(20);
		h.getAge();
		h.getName();
		
	}

}
