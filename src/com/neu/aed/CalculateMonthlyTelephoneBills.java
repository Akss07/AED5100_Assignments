package com.neu.aed;

/**
 * Write a program to calculate the monthly telephone bills as per the following rule: Minimum $ 200 for up to 100 calls.
 * Plus $ 0.60 per call for next 50 calls.
 * Plus $ 0.50 per call for next 50 calls.
 * Plus $ 0.40 per call for any call beyond 200 calls.
 *
 * Use Switch Statement in the function.
 */
public class CalculateMonthlyTelephoneBills {

    private static void calculateMonthlyTelephoneBills(int numberOfCalls){
        double minimumMonthlyBill = 200;
        switch ((numberOfCalls <= 100 )? 1 : (100 < numberOfCalls && numberOfCalls <= 150)? 2:
                (150 < numberOfCalls && numberOfCalls <= 200)? 3: 4){
            case 1:
                System.out.println("Minimum Monthly Telephone Bill for upto 100 calls " + minimumMonthlyBill);
                break;
            case 2:
                numberOfCalls = numberOfCalls - 100;
                minimumMonthlyBill += 0.60 * numberOfCalls;
                System.out.println("Monthly Telephone Bill for next 150 calls " + minimumMonthlyBill);
                break;
            case 3:
                numberOfCalls = numberOfCalls - 150;
                minimumMonthlyBill += (.60 * 50) + (0.50 * numberOfCalls);
                System.out.println("Monthly Telephone Bill for next 200 calls " + minimumMonthlyBill);
                break;
            case 4:
                numberOfCalls = numberOfCalls - 200;
                minimumMonthlyBill += (0.60 * 50) + (0.50 * 50) + (0.40 * numberOfCalls);
                System.out.println("Monthly Telephone Bill for beyond 200 calls " + minimumMonthlyBill);
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
