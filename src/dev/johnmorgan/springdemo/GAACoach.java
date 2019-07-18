package dev.johnmorgan.springdemo;

/**
 * Created by Johnny on 18/07/2019
 */
public class GAACoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on kicking practice";
    }
}
