package com.algo.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1110 {

    private static String makeCycle(String numOfString) {
        char[] ch = numOfString.toCharArray();
        String newNum = String.valueOf(
                Integer.parseInt(String.valueOf(ch[0])) + Integer.parseInt(String.valueOf(ch[1]))
        );

        return String.valueOf(ch[1]) + newNum.charAt(newNum.length() - 1);
    }

    public static void main(String... args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numberStr = reader.readLine();
        int cycle = 1;
        if(numberStr.length() == 1) { numberStr += "0"; }

        String t = makeCycle(numberStr);
        while(!t.equals(numberStr)) {
            t = makeCycle(t);
            ++cycle;
        }

        System.out.println(cycle);
    }

}
