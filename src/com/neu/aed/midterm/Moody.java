package com.neu.aed.midterm;

public abstract class Moody {

    public void queryMood(){
        System.out.println("How are you feeling today?");
    }

    abstract public String getMood();
    abstract void expressFeelings();

}
