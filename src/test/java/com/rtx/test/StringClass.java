package com.rtx.test;

import org.junit.Test;

public class StringClass {
    public void stringTest() {

        String a = "how are you";

        int aOne = a.indexOf('o');
        System.out.println(a.indexOf('o', aOne + 1));
        System.out.println(a.indexOf('o', aOne - 1));

        char[] charOne = a.toCharArray();
        for (int i = 0; i < charOne.length; i++) {
            System.out.println(charOne[i]);
        }

        String uppeString = a.toUpperCase();
        System.out.println(uppeString);
        String lowerString = uppeString.toLowerCase();
        System.out.println(lowerString);

        String trimString = a.trim();
        System.out.println(trimString);

        for (int i = charOne.length - 1; i >= 0; i--) {
            System.out.println(charOne[i]);
        }

        System.out.println(a.hashCode());

        if (a.endsWith("you")) {
            System.out.println("Correct");

        } else {
            System.out.println("NO!");
        }

        if (a.contains("are")) {
            System.out.println("Correct");

        } else {
            System.out.println("NO!");
        }

        String replaceString = a.replace('h', 'H');
        System.out.println(replaceString);

        System.out.println(a.replaceAll("how are you", "HOW ARE YOU"));

        int lastIndex = a.lastIndexOf('o');
        System.out.println(a.lastIndexOf('o', lastIndex - 1));

    }

    @Test
    public void stringTestTwo() {

        String oneString = "how are you";
        System.out.println(oneString);

        String twoString = "how you";
        // char oneChar = twoString.charAt(' ');
        String newString = twoString.replaceAll("how you", "How old are you");
        System.out.println(newString);

    }

    @Test
    public void testCaseThree() {
        String oneString = "How Are You";
        char[] oneChar = oneString.toCharArray();
        for (int i = 0; i < oneChar.length; i++) {
            System.out.println(oneChar[i]);
        }

    }

    @Test
    public void testCaseFour() {
        String a = "how are you";
        int b = a.indexOf("o");
        System.out.println(b);

        int c = a.indexOf("o", b + 1);
        System.out.println(c);

        char[] d = a.toCharArray();

    }

    @Test
    public void testCaseFive() {
        for(int i = 1; i<=100; i++){
            if (i%3==0) {
                System.out.println("one");
            }else if(i%3==0){
                System.out.println("two");
            }else if(i%3==0 && i%5==0){
                System.out.println("three");
            }else{
                System.out.println(i);
            }
        }


    }

    @Test
    public void testCaseSix() {
        int  result = 1;
        for(int i = 5; i<=1; i--){
            result = result *i;
            System.out.println(result);
        }

    }

    public void testCaseSeven() {
        

        
    }    
    
    
}
