package com.algo.datastructure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class A1715 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int i = 0; i < N; i++) {
            priorityQueue.add(Integer.parseInt(reader.readLine()));
        }

        if(priorityQueue.size() == 0) {
            System.out.println(priorityQueue.poll());
            return;
        }
        int sum = 0;
        while(priorityQueue.size() > 1) {
            int a = priorityQueue.poll();
            int b = priorityQueue.poll();
            sum += a + b;

            priorityQueue.add(a + b);
        }

        System.out.println(sum);
    }

}
