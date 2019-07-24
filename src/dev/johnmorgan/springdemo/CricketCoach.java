package dev.johnmorgan.springdemo;

/**
 * Created by Johnny on 24/07/2019
 */
public class CricketCoach implements Coach{
    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("CricketCoach: inside the no-arg constructor");
    }

    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on fast bowling practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
