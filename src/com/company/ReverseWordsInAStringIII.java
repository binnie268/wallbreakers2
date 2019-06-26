package com.company;


import com.sun.tools.corba.se.idl.StringGen;

public class ReverseWordsInAStringIII {

    public static void main(String[] args) {
        System.out.println(reverseWords( "I love u"));
    }

    public static String reverseWords(String s) {

        String[] stringArray = s.split(" ");
        String temp;

        for(int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i].length());
            if(stringArray[i].length() == 1) {
                continue;
            }
            int count = stringArray[i].length()-1;
            String[] stringArray2 = stringArray[i].split("");
            String[] tempWord = new String[stringArray[i].length()];
            for(int j = 0; j <= stringArray2.length/2; j++) {
                temp = stringArray2[j];
                stringArray2[j] = stringArray2[count];
                stringArray2[count] = temp;
                count--;
                tempWord = stringArray2;
            }

            stringArray[i] = String.join("", tempWord);
        }

        return String.join(" ", stringArray);
    }

}
