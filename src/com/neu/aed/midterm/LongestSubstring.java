package com.neu.aed.midterm;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        calculateLongestSubstring("abcabcbb");
    }

    public static int calculateLongestSubstring(String s){
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int result = 0;
        int n = s.length();
        for(int j = 0, i = 0; j<n; j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)),i);
            }
            result = Math.max(map.get(s.charAt(j)), j-i + 1 );
            map.put(s.charAt(j), j+1);
        }
        return result ;
    }

}
