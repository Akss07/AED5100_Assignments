package com.neu.aed.midterm;

public class Happy extends Moody {
    private String observerMessage = "Subject laughs a lot";
    private String happyMood = "I feel happy today";

    @Override
    public String getMood() {
        return happyMood;
    }

    @Override
    void expressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }
    public String toString(){
        return observerMessage;
    }

}
