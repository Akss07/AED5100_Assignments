package com.neu.aed.midterm;

public class StudentMain {
    public static void main(String[] args) {
        /**
         *Shallow Copy
         */
        System.out.println("***** Shallow Copy output ******");
        Student student = new Student("Harry",1, 3.89);
        Student student1 = student;
        student.display();
        student1.display();
        student.setGpa(4);
        System.out.println("**** After Changes ****");
        student.display();
        student1.display(); // it is pointing to its refrence, that's why gpa value is updated


        /**
         *Deep Copy
         */
        System.out.println("***** Deep Copy output ******");
        StudentDeepCopy studentDeepCopy = new StudentDeepCopy("Harry", 4, 3.89);
        StudentDeepCopy studentDeepCopy1 = new StudentDeepCopy(studentDeepCopy);
        studentDeepCopy.display();
        studentDeepCopy1.display();

        System.out.println("**** After Changes ****");
        studentDeepCopy.setGpa(4.0);
        studentDeepCopy.display(); // value of gpa is updated
        studentDeepCopy1.display(); // still points to original value

    }
}
