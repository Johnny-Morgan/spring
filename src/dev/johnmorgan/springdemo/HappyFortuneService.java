package dev.johnmorgan.springdemo;

/**
 * Created by Johnny on 22/07/2019
 * COMMENTS ABOUT THE PROGRAM GO HERE
 */
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune(){
        return "Today is your lucky day!";
    }
}
