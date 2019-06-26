package com.company;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));

    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]+","");

        int count = s.length()-1;
        char[] chars = s.toCharArray();
        char temp;

        for(int i = 0; i < chars.length/2; i++) {

            temp = chars[i];
            chars[i] = chars[count];
            chars[count] = temp;
            count--;
        }

        if(String.valueOf(chars).equalsIgnoreCase(s)) {
            return true;
        } else {
            return false;
        }
    }
}
