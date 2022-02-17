package com.neu.aed.assignment2;

/**
 * Question1: Implement given program using copy constructor by creating a class Student with two parameter
 * 1.	int rollNumber;
 * 2.	String name
 */
public class Student {
    private int rollNumber;
    private String name;

    public Student(int rollNumber, String name){
        this.rollNumber = rollNumber;
        this.name = name;
    }

    //Copy constructor
    public Student(Student s){
        this.rollNumber = s.rollNumber;
        this.name = s.name;
    }
    // getters and setters
    public int printRoll(){
        return this.getRollNumber();
    }

    public String printName(){
        return this.getName();
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
