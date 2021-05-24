package com.algo.datastructure2;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class A11279 {

    private final static int PRINT_TOP = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter con = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        int N = Integer.parseInt(reader.readLine());

        while(N-- > 0) {
            int x = Integer.parseInt(reader.readLine());

            if(x == PRINT_TOP) {
                con.write((priorityQueue.isEmpty() ? 0 : priorityQueue.poll()) + "\n");
            } else {
                priorityQueue.add(x);
            }
        }

        con.flush();
    }

}
