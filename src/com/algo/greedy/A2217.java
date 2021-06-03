package com.algo.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A2217 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < T; i++) { list.add(Integer.parseInt(reader.readLine())); }
        Collections.sort(list);

        int ans = 0;
        for(int i = 0; i < T; i++) {
            ans = Math.max(ans, list.get(i) * (T - i));
        }

        System.out.println(ans);
    }

}
