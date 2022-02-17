package com.neu.aed.assignment1;

import java.util.*;

/**
 * Questions from 1 to 5 are done here
 *
 * Considering upper case and lower case unequal
 */
public class StringAndArrayPrograms {
    /*
    Write a program to find if String is Palindrome?
    Not considering phrase ex : "he is a boy"
     */
    private static boolean isPalindrome(String string){
        if(string.length() == 0 || string.isBlank()){
            return false;
        }
        int i = 0, j = string.length()-1;
        while (i < j){
            if(string.charAt(i) == string.charAt(j)){
                i++;
                --j;
            }else{
                return false;
            }
        }
        return true;
    }

    /*
    Write a program to check if a string has all unique characters
     */
    private static boolean checkUniqueCharacters(String string){
        if(string.length() == 0 || string.isBlank()){
            return false;
        }
        Set<Character> set = new HashSet<>();
        for(int i = 0; i <string.length(); i++){
            char ch = string.charAt(i);
            set.add(ch);
        }
        if(set.size() == string.length()){
            return true;
        }else{
            return false;
        }
    }

    /*
    Write a program to check if string contains duplicates
     */
    private static boolean checkDuplicates(String string){
        if(string.length() == 0 || string.isBlank()){
            return false;
        }
        Set<Character> set = new HashSet<>();
        for(int i = 0; i <string.length(); i++){
            char ch = string.charAt(i);
            set.add(ch);
        }
        if(set.size() == string.length()){
            return false;
        }else{
            return true;
        }
    }

    /*
    Write a program to check if two strings are anagrams.
     */
    private static boolean checkIfStringsAreAnagram(String string1, String string2){
        Map<Character, Integer> map = new HashMap<>();
        if(string1.length() != string2.length() || string1.isBlank() || string2.isBlank()){
            return false;
        }
        for(int i =0; i<string1.length(); i++){
            map.put(string1.charAt(i), map.getOrDefault(string1.charAt(i), 0) + 1);
            map.put(string2.charAt(i), map.getOrDefault(string2.charAt(i), 0) - 1);
        }
        for(int count : map.values()){
            if(count != 0){
                return false;
            }
        }
        return true;
    }

    /*
     Write a program to determine whether the year is a leap year or not.
     */
    private static boolean checkIfYearIsLeapYear(int year){
        if(year % 4 == 0){
            if(year%100 == 0){
                if(year%400 == 0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return true;
            }
        }
        return false;
    }
}
