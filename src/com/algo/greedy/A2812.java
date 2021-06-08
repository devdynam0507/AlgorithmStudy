package com.algo.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A2812 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(tokenizer.nextToken());
        int K = Integer.parseInt(tokenizer.nextToken());
        char[] ch = reader.readLine().toCharArray();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            int num = ch[i] - '0';
            arr[i] = num;
        }

        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i < arr.length; i++) {
            while(K > 0 && !deque.isEmpty() && deque.getLast() < arr[i]) {
                deque.removeLast();
                --K;
            }

            deque.addLast(arr[i]);
        }

        StringBuilder sb = new StringBuilder();
        while(deque.size() > K) {
            sb.append(deque.pollFirst());
        }

        System.out.println(sb.toString());
    }
}
