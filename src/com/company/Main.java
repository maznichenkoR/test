package com.company;

import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
        System.out.println("Hello world!!!");
        System.out.println("Its my first git");

        Parser parser = new Parser();
        parser.strings[0] = "1";
        parser.op = '+';
        parser.setaBoolean(true);
        System.out.println(parser.strings[0] + parser.strings[1]);
        System.out.println(parser.op);
        System.out.println(parser.isaBoolean());

        
        int result = NumbersConverter.convertRomanToArabic("IV");
        System.out.println("result = " + result);
        String resultStr = NumbersConverter.convertArabicToRoman(100);
        System.out.println("resultStr = " + resultStr);
    }
}
