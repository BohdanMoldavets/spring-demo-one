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

    public void doStartupStuff() {
        System.out.println("Track Coach: inside method doStartupStuff");
    }

    public void doCleanupStuff() {
        System.out.println("Track Coach: inside method doCleanupStuff");
    }
}
