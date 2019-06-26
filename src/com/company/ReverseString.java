package com.company;

public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);

    }

    public static void reverseString(char[] s) {

        int count = s.length-1;
        char temp;
        for(int i = 0; i < s.length/2; i++) {
            temp = s[i];
            s[i] = s[count];
            s[count] = temp;
            count--;
        }
    }
}
