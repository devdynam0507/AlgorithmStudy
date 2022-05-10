package com.algo.strings;

import java.util.Scanner;

public class Inflearn107 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String result = "YES";

        for(int i = 0; i < line.length(); i++) {
            int pre = line.charAt(i);
            int post = line.charAt(line.length() - 1 - i);

            if(pre > 90) {
                pre -= 32;
            }
            if(post > 90) {
                post -= 32;
            }

            if(pre != post) {
                result = "NO";
                break;
            }
        }
        System.out.println(result);
    }

}
