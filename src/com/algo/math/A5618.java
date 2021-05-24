package com.algo.math;

import java.io.*;
import java.util.StringTokenizer;

public class A5618 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter con = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] numbers = new int[Integer.parseInt(reader.readLine())];
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int max = 0;

        for(int i = 0; i < numbers.length; i++) {
            int n = Integer.parseInt(tokenizer.nextToken());

            if(n > max) { max = n; }
            numbers[i] = n;
        }

        for(int i = 1; i <= max; i++) {
            boolean flag = true;

            for(int j = 0; j < numbers.length; j++) {
                if(numbers[j] % i != 0) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                con.write(String.valueOf(i) + "\n");
            }
        }

        con.flush();
    }

}
