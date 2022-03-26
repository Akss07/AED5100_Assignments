package com.neu.aed.midterm;

public class Psychiatrist {
    public void examine(Moody moodyObject){
    moodyObject.queryMood();
    System.out.println(moodyObject.getMood());
    moodyObject.expressFeelings();
    }

    public void observe(Moody moodyObject){
        System.out.println(moodyObject.toString());
    }

    public String toString(){
        return null;
    }
}
