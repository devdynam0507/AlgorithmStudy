package com.algo.datastructure;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class A2346 {
    public static BufferedWriter console;

    private static void bang(Deque<int[]> deque) throws IOException{
        StringBuilder sb = new StringBuilder();

        while(!deque.isEmpty()) {
            int[] e = deque.pollFirst();
            int n = e[0];
            sb.append(e[1]).append(" ");

            if(!deque.isEmpty()) {
                if (n > 0) {
                    --n;
                    while (n-- > 0) {
                        deque.addLast(deque.pollFirst());
                    }
                } else {
                    while (n++ < 0) {
                        deque.addFirst(deque.pollLast());
                    }
                }
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        console.write(sb.toString());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        console = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<int[]> list = new ArrayDeque<>();
        int n = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        for(int i = 0; i < n; i++) {
            list.addLast(new int[] {Integer.parseInt(tokenizer.nextToken()), i + 1});
        }

        bang(list);
        console.flush();
    }
}

