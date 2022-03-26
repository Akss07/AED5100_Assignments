package com.neu.aed.midterm;

public class Main {
    public static void main(String[] args) {
        Psychiatrist psychiatrist = new Psychiatrist();
        Sad moodSad = new Sad();
        Happy moodHappy = new Happy();

        psychiatrist.examine(moodHappy);
        psychiatrist.observe(moodHappy);
        psychiatrist.examine(moodSad);
        psychiatrist.observe(moodSad);

    }




}
