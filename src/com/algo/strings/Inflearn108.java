package com.algo.strings;

import java.util.Scanner;

public class Inflearn108 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String line = in.nextLine().toUpperCase().replaceAll("[^a-zA-Z]", "");
        String result = "YES";

        for(int i = 0; i < line.length() / 2; i++) {
            if(line.charAt(i) != line.charAt(line.length() - 1 - i)) {
                result = "NO";
                break;
            }
        }

        System.out.println(result);
    }

}
