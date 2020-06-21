package com.molim.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired //since spring 4.3 optional if we have only one constructor
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Practice backend volley";
	}

	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	
}
