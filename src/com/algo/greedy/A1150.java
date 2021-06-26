package com.algo.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class A1150 {

    static class Connect {
        public int left, right;
        public int length;

        public Connect(int left, int right, int length) {
            this.left = left;
            this.right = right;
            this.length = length;
        }
    }

    // 나중에
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        int[] arr = new int[n];
        boolean[] visit = new boolean[n];
        PriorityQueue<Connect> pq = new PriorityQueue<>(new Comparator<Connect>() {
            @Override
            public int compare(Connect o1, Connect o2) {
                return 0;
            }
        });

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }

        for(int i = 1; i < n; i++) {
            Connect connect = new Connect(i - 1, i, arr[i] - arr[i - 1]);
            pq.offer(connect);
        }

        while(k-- > 0) {

        }
    }

}
