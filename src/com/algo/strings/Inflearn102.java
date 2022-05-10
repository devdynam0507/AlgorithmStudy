package com.algo.strings;

import java.util.Scanner;

public class Inflearn102 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        char[] arr = in.nextLine().toCharArray();

        for(int i = 0; i < arr.length; i++) {
            int conv = arr[i] - 32;
            if(conv < 65) {
                conv = arr[i] + 32;
            }
            sb.append((char)conv);
        }

        System.out.println(sb.toString());
    }

}
