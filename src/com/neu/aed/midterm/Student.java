package com.neu.aed.midterm;

/**
 * Shallow Copy - Shallow Copy doesn't create the new copy it points to the same object
 */
public class Student {
    private String name;
    private int studentId;
    private  double gpa;

    public Student(String name, int studentId, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void display(){
        System.out.println("Studnet Name " + name);
        System.out.println("Studnet Id " + studentId);
        System.out.println("Studnet gpa " + gpa);
    }

}
