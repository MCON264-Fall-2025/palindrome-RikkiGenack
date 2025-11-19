package com.example.palindrome;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class PalindromeWithStackQueue {

    /**
     * Implement a method that uses a Stack and a Queue
     * to determine whether the input string is a palindrome.
     * Palindromes read the same forwards and backwards,
     * ignoring case and non-alphanumeric characters.
     * Use Stack and Queue provided by Java's standard library.
     */
    public static boolean isPalindrome(String s) {
        Stack<Character> charStack = new Stack<>();
        Queue<Character> charQueue = new LinkedList<>();
        char currChar;

        if(s==null)
            throw new IllegalArgumentException("String is null");

        // add characters in order to a stack and a queue
        for (int i = 0; i < s.length(); i++) {
            currChar = s.charAt(i);
            if (Character.isLetter(currChar)) {
                charStack.push(Character.toLowerCase(currChar));
                charQueue.add(Character.toLowerCase(currChar));
            }
        }
        int size = charStack.size();
        // pop stack and remove from queue and compare them
        for(int i = 0;i<size;i++){
          if(charStack.pop()!=(charQueue.remove())){
              return false;
          }
        }return true;
    }

    // Optional helper method for normalization
    public static String normalize(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }
}
