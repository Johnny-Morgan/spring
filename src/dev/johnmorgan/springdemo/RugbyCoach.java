package dev.johnmorgan.springdemo;

/**
 * Created by Johnny on 18/07/2019

 */
public class RugbyCoach implements Coach {

    private FortuneService fortuneService;

    public RugbyCoach() {
    }

    public RugbyCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on scrum practice";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneService.getFortune();
    }
}
