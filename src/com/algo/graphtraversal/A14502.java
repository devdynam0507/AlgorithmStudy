package com.algo.graphtraversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class A14502 {

    static boolean[] visit;
    static ArrayList<Integer>[] list;

    public static void dfs(int x) {
        if(visit[x]) {
            return;
        }
        visit[x] = true;
        ArrayList<Integer> element = list[x];
        int size = element.size();
        for(int i = 0; i < size; i++) {
            if(!visit[element.get(i)]) {
                dfs(element.get(i));
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());
        list = new ArrayList[N + 1];
        visit = new boolean[N + 1];

        for(int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            int x = Integer.parseInt(tokenizer.nextToken());
            int y = Integer.parseInt(tokenizer.nextToken());
            list[x].add(y);
            list[y].add(x);
        }

        int cnt = 0;
        for(int i = 1; i <= N; i++) {
            if(!visit[i]) {
                dfs(i);
                ++cnt;
            }
        }

        System.out.println(cnt);
    }

}
