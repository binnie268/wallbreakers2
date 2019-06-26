package com.company;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {

        char[] charArray = s.toCharArray();
        int leftHandSideCount = charArray.length-1;
        int rightHandSideVowelIndex = charArray.length + 1;
        int leftHandSideVowelIndex = charArray.length + 1;
        String vowels = "AEIOUaeiou";
        boolean isRightVowelFound = false;
        boolean isLeftVowelFound = false;
        char temp;

        for (int i = 0; i < charArray.length/2; i++) {
            if(vowels.indexOf(charArray[i]) > -1) {
                rightHandSideVowelIndex = i;
                isRightVowelFound = true;
            }

            if(vowels.indexOf(charArray[leftHandSideCount]) > -1) {
                leftHandSideVowelIndex = leftHandSideCount;
                isLeftVowelFound = true;
            }

            if(!isLeftVowelFound) {

            }
            if((rightHandSideVowelIndex < charArray.length + 1) && leftHandSideVowelIndex < charArray.length + 1) {
                temp = charArray[i];
                charArray[i] = charArray[leftHandSideCount];
                charArray[leftHandSideCount] = temp;

                rightHandSideVowelIndex = charArray.length + 1;
                leftHandSideVowelIndex = charArray.length + 1;
                leftHandSideCount--;

            }

        }

        return String.valueOf(charArray);
    }
}
