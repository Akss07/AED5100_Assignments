package com.neu.aed.midterm;

public class Sad extends Moody {
    private String observerMessage = "Subject cries a lot";
    private String sadMood = "I feel Sad today";

    @Override
    public String getMood() {
        return sadMood;
    }

    @Override
    void expressFeelings() {
        System.out.println("waah’ ‘boo hoo’ ‘weep’ ‘sob");
    }

    public String toString(){
        return observerMessage;
    }
}
