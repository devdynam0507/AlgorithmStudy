package com.algo.greedy;

import java.io.*;
import java.util.*;

public class A13975 {

    private static long solution(PriorityQueue<Long> pq) {
        long result = 0L;
        while(pq.size() > 1) {
            long x1 = pq.poll() + pq.poll();

            result += x1;
            pq.add(x1);
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(reader.readLine());

        for(int i = 0; i < T; i++) {
            int amountOfPage = Integer.parseInt(reader.readLine());
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            PriorityQueue<Long> pq = new PriorityQueue<>();

            for(int j = 0; j < amountOfPage; j++) {
                pq.add(Long.parseLong(tokenizer.nextToken()));
            }
            writer.write(solution(pq) + "\n");
        }
        writer.flush();
    }
}
