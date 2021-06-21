package com.algo.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class A15721 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(reader.readLine());
        int T = Integer.parseInt(reader.readLine());
        int chant = Integer.parseInt(reader.readLine());

        int cnt = 2;
        int c1 = 0; //뻔
        int c2 = 0; //데기
        while(true) {
            for(int i = 0; i < 4; i++) {
                if(i % 2 == 0) {
                    ++c1;
                }
                else {
                    ++c2;
                }

                if(c1 == T && chant == 0 || c2 == T && chant == 1) {
                    System.out.println((c1 + c2 - 1) % A);
                    return;
                }
            }
            for(int i = 0; i < cnt; i++) {
                ++c1;
                if(c1 == T && chant == 0) {
                    System.out.println((c1 + c2 - 1) % A);
                    return;
                }
            }
            for(int i = 0; i < cnt; i++) {
                ++c2;
                if(c2 == T && chant == 1) {
                    System.out.println((c1 + c2 - 1) % A);
                    return;
                }
            }
            ++cnt;
        }
    }

}
