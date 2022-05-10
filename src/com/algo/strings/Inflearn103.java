package com.algo.strings;

import java.util.Scanner;

public class Inflearn103 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] words = in.nextLine().split(" ");

        String longest = words[0];
        for(int i = 1; i < words.length; i++) {
            if(longest.length() < words[i].length()) {
                longest = words[i];
            }
        }

        System.out.println(longest);
    }

}
