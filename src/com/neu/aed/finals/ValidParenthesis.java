package com.neu.aed.finals;

import java.util.HashMap;
import java.util.Stack;

/***
 * Question 1: Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 */
public class ValidParenthesis {
    public boolean isValid(String s) {

        if(s.isEmpty() || s.length() == 0 || s.isEmpty()) return false;

        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put(')', '('); // Initialize the hashmap with close bracket as key and open bracket as value
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){ //if character is not closing bracket add in the stack
                stack.push(ch);
            }else if(stack.isEmpty()){ // if stack is empty return false
                return false;
            }else{
                if(map.get(ch) != stack.pop()){ //if the mapping of current character doesn't match the top element return false
                    return false;
                }
            }
        }
        return stack.isEmpty(); // if stack contains the element then it is invalid string
    }
}
