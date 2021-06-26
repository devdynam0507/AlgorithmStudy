package com.algo.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2003 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());
        int[] arr = new int[N];
        tokenizer = new StringTokenizer(reader.readLine());

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int right = 0, left =0;
        int sum = 0;
        int cnt = 0;
        while(true) {
            if(right == N){
                break;
            }

            if(sum < M) {
                sum += arr[right++];
            }
            else if(sum >= M) {
                sum -= arr[left++];
            }

            if(sum == M) {
                cnt += 1;
            }
        }

        System.out.println(cnt);
    }

}
