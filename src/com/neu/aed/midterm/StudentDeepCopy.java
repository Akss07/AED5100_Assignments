package com.neu.aed.midterm;

/**
 * DeepCopy -  DeepCopy makes the copy of object in the memory
 */
public class StudentDeepCopy {
    private String name;
    private int studentId;
    private  double gpa;

    public StudentDeepCopy(String name, int studentId, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public StudentDeepCopy(StudentDeepCopy studentDeepCopy){
        this.name = studentDeepCopy.name;
        this.studentId = studentDeepCopy.studentId;
        this.gpa = studentDeepCopy.gpa;
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
