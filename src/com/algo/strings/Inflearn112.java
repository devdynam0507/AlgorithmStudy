package com.algo.strings;

import java.util.Scanner;

public class Inflearn112 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int cnt = in.nextInt();
        in.nextLine();
        String line = in.nextLine();

        int start = 0;
        int end = 7;
        for(int i = 0; i < cnt; i++) {
            String secret = line.substring(start, end);
            secret = secret.replace("#", "1");
            secret = secret.replace("*", "0");
            System.out.print((char)Integer.parseInt(secret, 2));

            start += 7;
            end += 7;
        }
    }

}
