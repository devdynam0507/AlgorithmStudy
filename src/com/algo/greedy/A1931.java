package com.algo.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

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

        for(int i = 0; i < meetingList.size(); i++) {
            int[] meet = meetingList.get(i);

            for(int j = i + 1; j < meetingList.size(); j++) {
                int[] target = meetingList.get(j);

            }
        }
    }

}
