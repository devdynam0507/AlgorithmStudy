package com.algo.datastructure2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class A1620 {

    public static void main(String... args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter con = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());

        Map<String, Integer> nameToIndex = new HashMap<>();
        Map<String, String> indexToName = new HashMap<>();

        for(int i = 1; i <= N; i++) {
            String name = reader.readLine();

            nameToIndex.put(name, i);
            indexToName.put(String.valueOf(i), name);
        }

        for(int i = 1; i <= M; i++) {
            String read = reader.readLine();
            Integer index = nameToIndex.get(read);

            if(index != null) {
                con.write(index + "\n");
            } else {
                con.write(indexToName.get(read) + "\n");
            }
        }

        con.flush();
    }

}
