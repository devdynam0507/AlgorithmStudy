package com.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int h = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());

        h = (h * 60) + m;

        if(h - 45 < 0) {
            h = 1440 - (Math.abs(h - 45));
        } else {
            h -= 45;
        }

        System.out.println((h / 60) + " " + (h % 60));
    }
}
