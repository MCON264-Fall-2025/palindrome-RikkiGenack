package com.example.palindrome;

public final class PalindromeWithTwoPointers {
    private PalindromeWithTwoPointers() { /* utility */ }

    /**
     * Implement a method that uses the two-pointer technique
     *
     * @param s input string (must not be null)
     * @return true if palindrome
     * @throws IllegalArgumentException if s is null
     */
    public static boolean isPalindrome(String s) {
        if(s==null)
            throw new IllegalArgumentException("String is null");

        int left=0;
        int right=s.length()-1;
        s = s.toLowerCase();

        while(left<right){

            if (!(Character.isLetterOrDigit(s.charAt(left)))) {
                left++;
            }
           else  if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            else {
                if (s.charAt(left) == (s.charAt(right))) {
                    left++;
                    right--;
                } else {
                    return false;
                }
            }
            }
         return true;

    }

    // package-private for testing if needed
    static String normalize(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }
}

