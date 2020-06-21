package com.molim.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] data = {
			"One",
			"Two",
			"Three",
			"Four"
	};
	private Random random = new Random();

	public String getFortune() {
		int index = random.nextInt(data.length);
		return data[index];
	}

}
