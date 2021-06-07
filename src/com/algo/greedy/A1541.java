package com.algo.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A1541 {

    public static int calc(String str, int n) {
        int sum = 0;

        if(str.contains("+")) {
            StringTokenizer tokenizer = new StringTokenizer(str, "+");

            while (tokenizer.hasMoreTokens()) {
                sum += Integer.parseInt(tokenizer.nextToken());
            }

        } else {
            sum = Integer.parseInt(str);
        }

        if(n > 0) { return -sum; }
        else { return sum; }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String expression = reader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(expression, "-");

        int sum = 0;
        int n = 0;
        while(tokenizer.hasMoreTokens()) {
            sum += calc(tokenizer.nextToken(), n);
            n++;
        }

        System.out.println(sum);
    }

}
