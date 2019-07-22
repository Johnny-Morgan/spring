package dev.johnmorgan.springdemo;

/**
 * Created by Johnny on 18/07/2019
 */
public class GAACoach implements Coach{

    // define a private field for the dependency
    private FortuneService fortuneService;

    // define a constructor for the dependency injection
    public GAACoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on kicking practice";
    }

    @Override
    public String getDailyFortune() {

        // use my FortuneService to get a fortune
        return fortuneService.getFortune();
    }

}
