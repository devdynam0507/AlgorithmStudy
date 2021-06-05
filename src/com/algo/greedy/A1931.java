package com.algo.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A1931 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        List<int[]> meetingList = new ArrayList<>();

        for(int i = 0; i < T; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int[] I = new int[] { Integer.parseInt(tokenizer.nextToken()),
                    Integer.parseInt(tokenizer.nextToken()) };
            meetingList.add(I);
        }
        Collections.sort(meetingList, (int[] o1, int[] o2) -> {
            if(o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }

            return o1[1] - o2[1];
        });

        int before = meetingList.get(0)[1];
        int cnt = 1;
        int size = meetingList.size();
        for(int i = 1; i < size; i++) {
            int[] meet = meetingList.get(i);

            if(before <= meet[0]) {
                cnt++;
                before = meet[1];
            }
        }

        System.out.println(cnt);
    }

}
