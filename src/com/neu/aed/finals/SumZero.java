package com.neu.aed.finals;

/**
 * Question 4: Given an integer n, return any array containing n unique integers such that they add up to 0.
 */
public class SumZero {
    public int[] sumZero(int n) {
       int[] newArray = new int[n]; //Initialize new array
       int index = 0;
       int value = 1;

        if(n%2 != 0){  //if n is odd add 0 to 0th index
            newArray[0] = 0;
            index = 1;
        }

        while(index < n){
            newArray[index] = -value; // inserting positive and negative value up to n length
            newArray[index+1] = value;
            index+=2;
            value+=1;
        }
        return newArray;
    }
}
