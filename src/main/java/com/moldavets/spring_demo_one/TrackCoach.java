package com.moldavets.spring_demo_one;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 5k marathon";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
