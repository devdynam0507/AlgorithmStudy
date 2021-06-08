package com.algo.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A2141 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        List<long[]> list = new ArrayList<>();
        long total = 0;

        for(int i = 0; i < T; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            long X = Long.parseLong(tokenizer.nextToken());
            long A = Long.parseLong(tokenizer.nextToken());
            list.add(new long[] { X, A });
            total += A;
        }
        Collections.sort(list, new Comparator<long[]>() {
            @Override
            public int compare(long[] o1, long[] o2) {
                if(o1[0] == o2[0]) {
                    return (int) (o1[1] - o2[1]);
                }

                return (int) (o1[0] - o2[0]);
            }
        });

        total += 1;
        total /= 2;

        long answer = 0;
        for(int i = 0; i < T; i++) {
            long[] l = list.get(i);
            answer += l[1];

            if(answer >= (total + 1) / 2) {
                System.out.println(String.valueOf(l[0]));
                return;
            }
        }
    }

}
