package com.algo.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2745 {

    public static int pow(int ni, int cnt) {
        int result = 1;
        for(int i = 1; i <= cnt; i++) { result *= ni; }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        char[] s = tokenizer.nextToken().toCharArray();
        int B = Integer.parseInt(tokenizer.nextToken());
        int ni = 0; //지수
        int result = 0;

        for(int i = s.length - 1; i >= 0; i--)  {
            char ch = s[i];
            int num;

            if(ch >= 55 && ch <= 90) {
                num = ch - 55;
            } else {
                num = ch - '0';
            }

            result += num * Math.pow(B, ni);
            ++ni;
        }

        System.out.println(result);
    }

}
