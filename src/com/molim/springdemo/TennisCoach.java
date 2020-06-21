package com.molim.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/*@Autowired //since spring 4.3 optional if we have only one constructor
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	public String getDailyWorkout() {
		return "Practice backend volley";
	}

	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	
	@PostConstruct
	public void postInit() {
		System.out.println("TennisCoach: postInit");
	}
	
	@PreDestroy
	public void beforeDestroy() {
		System.out.println("TennisCoach: beforeDestroy");
	}
	
}
