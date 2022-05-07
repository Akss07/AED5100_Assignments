package com.neu.aed.finals;

import java.util.HashMap;

/**
 * Question 3: Given a string s, find the length of the longest substring without repeating characters.
 */
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0 || s.isEmpty()) return 0;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int maxLength=0;
        for (int i = 0, j = 0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){     //if map contains character update j with max value
                j = Math.max(j, map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            maxLength = Math.max(maxLength, i-j+1 );
        }
        return maxLength;
    }
}
