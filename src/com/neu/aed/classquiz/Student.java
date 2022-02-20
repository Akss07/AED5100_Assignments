package com.neu.aed.classquiz;

public class Student extends Person{

    public Student(String name, int id, int age) {
        super(name, id, age);
    }

    public void takeQuiz(String quizTaken){
        System.out.println("Inside take quiz " + quizTaken);
    }
}
