package com.algo.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A16953 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int A = Integer.parseInt(tokenizer.nextToken());
        int B = Integer.parseInt(tokenizer.nextToken());

        int cnt = 1;
        while(A < B) {
            if(B % 2 == 0) {
                B /= 2;
                ++cnt;
            } else {
                String str = String.valueOf(B);

                if(str.charAt(str.length() - 1) == '1') {
                    B = Integer.parseInt(str.substring(0, str.length() - 1));
                    ++cnt;
                } else {
                    System.out.println(-1);
                    return;
                }
            }
        }

        if(A != B) {
            System.out.println(-1);
            return;
        }

        System.out.println(cnt);
    }

}
