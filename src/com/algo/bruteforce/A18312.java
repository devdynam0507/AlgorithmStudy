package com.algo.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A18312 {

    static boolean checkInK(long time, int k) {
        long h = time / 3600;
        long m = time % 3600 / 60;
        long s = time % 3600 % 60 % 60;

        return (String.format("%02d", h) + String.format("%02d", m) + String.format("%02d", s)).contains(k + "");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(tokenizer.nextToken());
        int K = Integer.parseInt(tokenizer.nextToken());

        long time = 0;
        long endTime = (3600 * N) + (60 * 59) + 59;
        int cnt = 0;

        while(time <= endTime) {
            if(checkInK(time, K)) {
                ++cnt;
            }

            ++time;
        }
        System.out.println(cnt);
    }

}
