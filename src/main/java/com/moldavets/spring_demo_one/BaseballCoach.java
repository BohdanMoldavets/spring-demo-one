package com.moldavets.spring_demo_one;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 min in gym";
    }

    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }

}
