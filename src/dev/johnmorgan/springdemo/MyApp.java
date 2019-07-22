package dev.johnmorgan.springdemo;

/**
 * Created by Johnny on 18/07/2019
 */
public class MyApp {
    public static void main(String[] args) {

        Coach theCoach = new RugbyCoach();

        System.out.println(theCoach.getDailyWorkout());

    }
}
