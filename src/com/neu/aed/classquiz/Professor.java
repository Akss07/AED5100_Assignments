package com.neu.aed.classquiz;

public class Professor extends Person{

    public Professor(String name, int id, int age) {
        super(name, id, age);
    }

    public void giveQuiz(String quiz){
        System.out.println("Inside give quiz " + quiz);
    }

}
