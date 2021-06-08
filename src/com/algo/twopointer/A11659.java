package com.algo.twopointer;

import java.io.*;
import java.util.StringTokenizer;

// 구간
public class A11659 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        StringTokenizer arrTokenizer = new StringTokenizer(reader.readLine());
        int T = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());
        int[] table = new int[T + 1];

        int sum = 0;
        for(int i = 0; i < T; i++) {
            sum += Integer.parseInt(arrTokenizer.nextToken());
            table[i + 1] = sum;
        }

        for(int k = 0; k < M; k++) {
            StringTokenizer t = new StringTokenizer(reader.readLine());
            int i = Integer.parseInt(t.nextToken());
            int j = Integer.parseInt(t.nextToken());
            writer.write(table[j] - table[i - 1] + "\n");
        }

        writer.flush();
    }
}
