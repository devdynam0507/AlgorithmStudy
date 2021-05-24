package com.algo.datastructure2;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class A11286 {

    private final static int PRINT_TOP = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter con = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int a1 = Math.abs(o1);
            int a2 = Math.abs(o2);

            if(a1 == a2) {
                return o1 > o2 ? 1 : -1;
            }

            return a1 - a2;
        });
        int N = Integer.parseInt(reader.readLine());

        while(N-- > 0) {
            int a = Integer.parseInt(reader.readLine());

            if(a == PRINT_TOP) {
                con.write((queue.isEmpty() ? 0 : queue.poll()) + "\n");
                continue;
            }

            queue.add(a);
        }

        con.flush();
    }

}
