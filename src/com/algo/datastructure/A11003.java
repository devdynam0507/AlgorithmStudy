package com.algo.datastructure;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class A11003 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(tokenizer.nextToken());
        int L = Integer.parseInt(tokenizer.nextToken());
        tokenizer = new StringTokenizer(reader.readLine());
        Deque<int[]> dq = new ArrayDeque<>();
        int[] arr = new int[N + 1];
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        for(int i = 1; i <= N; i++) {
            int a = arr[i];

            if(!dq.isEmpty() && dq.peekFirst()[1] < i - L + 1) {
                dq.pollFirst();
            }

            while(!dq.isEmpty() && dq.peekLast()[0] > a) {
                dq.pollLast();
            }

            // L개 초과시 무의미한 데이터 poll
            dq.addLast(new int[] {a, i});
            sb.append(dq.peekFirst()[0]).append(" ");
        }

        writer.write(sb.toString());
        writer.flush();
    }

}
