package com.company;

public class DetectCapital {

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("Leetcode"));
    }

    public static boolean detectCapitalUse(String word) {

        if(word.matches("[a-z]+") || word.matches("[A-Z]+")) {
            return true;
        }  else {
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    count++;
                }

                if(count >= 2) {
                    return false;
                }
            }

            if(Character.isUpperCase(word.charAt(0))) {
                return true;
            }

            return false;
        }
    }
}
