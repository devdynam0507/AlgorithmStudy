package com.algo.datastructure2;

import java.io.*;
import java.util.*;

public class A14425 {

    public static void main(String... args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        Map<String, Boolean> map = new HashMap<>();
        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());

        for(int i = 0; i < N; i++) { map.put(reader.readLine(), true); }

        int cnt = 0;
        for(int i = 0; i < M; i++) {
            String read = reader.readLine();

            if(map.get(read) != null) { ++cnt; }
        }

        System.out.println(cnt);
    }

}
