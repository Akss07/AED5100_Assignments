package com.neu.aed;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 */
public class Construct {
    public static void main(String[] args) {
        System.out.println(canConstruct("abcde","bacDqeff"));
    }
    //Considering upper case and lower case unequal
    private static boolean canConstruct(String ransomNote, String magazine){
        if(ransomNote.length() > magazine.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0; i < magazine.length(); i++){
            char ch = magazine.charAt(i);
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
        for(int i =0; i< ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) - 1);
                if(map.get(ch) == 0){
                    map.remove(ch);
                }
            }else{
                return false;
            }
        }
        return true;
    }
}
