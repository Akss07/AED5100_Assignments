package com.neu.aed.finals;

/**
 * Question 3: Given a string s, find the length of the longest substring without repeating characters.
 */
public class StringCompression {

    public String compressString(String str){
        if(str.isEmpty() || str.isBlank()) return ""; //return null if string is null or empty
        int count = 1;
        StringBuilder compressedString = new StringBuilder();

        for(int i =0; i<str.length()-1; i++){
            Character firstChar = str.charAt(i);
            Character secondChar = str.charAt(i+1);

            if(firstChar == secondChar){ // increase count if first and second character is equal
                count++;
            }else{
                compressedString.append(firstChar); // append character if not equal
                compressedString.append(count);     // append count
                count = 1;
            }
        }
        compressedString.append(str.charAt(str.length()-1)); // append for last character
        compressedString.append(count);
        return compressedString.toString();
    }
}
