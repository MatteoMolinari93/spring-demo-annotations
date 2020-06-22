package com.molim.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.email}") private String email;
	@Value("${foo.team}") private String team;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Swim 1000 meters as warmup";
	}

	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	
	public String test() {
		return this.email + " - " + this.team;
	}

}
