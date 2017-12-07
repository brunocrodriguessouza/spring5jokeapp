package com.brunosouza.spring5jokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.brunosouza.spring5jokeapp.services.JokeService;
import com.brunosouza.spring5jokeapp.services.JokeServiceImpl;

@SpringBootApplication
public class Spring5jokeappApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5jokeappApplication.class, args);

	}
}
