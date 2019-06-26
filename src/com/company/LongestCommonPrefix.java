package com.company;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"abca","abc"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {

        boolean isEqualSoFar = true;
        StringBuilder longestCommonPrefix = new StringBuilder();
        int index = 0;
        int index2 = 0;
        if(strs.length == 0 || strs[0].equals("")) {
            return "";
        }
        while(isEqualSoFar) {

            for(int i = 0; i < strs.length-1; i++) {
                index2 = i;
                if((index < strs[i].length() && index < strs[i+1].length()) && strs[i].charAt(index) == strs[i+1].charAt(index)) {
                    continue;
                } else {
                    isEqualSoFar = false;
                    break;
                }
            }

            if(isEqualSoFar) {
                longestCommonPrefix.append(strs[index2].charAt(index));
            }

            if(index == strs[index2].length()-1) {
                isEqualSoFar = false;
            }

            index++;
        }

        return longestCommonPrefix.toString();
    }
}
