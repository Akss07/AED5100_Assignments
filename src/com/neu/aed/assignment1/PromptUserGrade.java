package com.neu.aed.assignment1;

/**
 * Write a program that prompts the user’s grade. Your program should display the corresponding meaning of grade as per the following table
 * Grade Meaning
 * A Excellent
 * B Good
 * C Average
 * D Deficient
 * F Failing
 */
public class PromptUserGrade {
    public static void main(String[] args) {
        promptUserGrade('A');
    }

    private static void promptUserGrade(char grade){
        switch (grade){
            case 'A':
                System.out.println(grade + " Excellent");
                break;
            case 'B':
                System.out.println(grade + " Good");
                break;
            case 'C':
                System.out.println(grade + " Average");
                break;
            case 'D':
                System.out.println(grade + " Deficient");
                break;
            case 'F':
                System.out.println(grade + " Failing");
                break;
            default:
                System.out.println("INVALID GRADE!");
        }
    }
}
