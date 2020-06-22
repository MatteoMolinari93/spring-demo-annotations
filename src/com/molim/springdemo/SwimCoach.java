package com.molim.springdemo;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getDailyWorkout() {
		return "Swim 1000 meters as warmup";
	}

	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
