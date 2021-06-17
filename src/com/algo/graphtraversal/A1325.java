package com.algo.graphtraversal;

import java.io.*;
import java.util.*;

public class A1325 {

    static boolean[] visited;
    static boolean[] visitList;
    static int[] ans = new int[10001];
    static Set<Integer> list = new HashSet<>();
    static int depth = 0;

    public static void dfs(ArrayList<Integer>[] arr, int v) {
        if(visited[v]) { return; }

        visited[v] = true;

        int size = arr[v].size();
        for(int i = 0; i < size; i++) {
            int e = arr[v].get(i);

            if(!visited[e]) {
                ans[e]++;
                dfs(arr, e);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());
        ArrayList<Integer>[] arr = new ArrayList[N + 1];
        visitList = new boolean[N + 1];
        for(int i = 1; i <= N; i++) { arr[i] = new ArrayList<>(); }

        for(int i = 0; i < M; i++) {
            String[] split = reader.readLine().split(" ");
            int A = Integer.parseInt(split[0]);
            int B = Integer.parseInt(split[1]);

            arr[A].add(B);
        }

        for(int i = 1; i <= N; i++) {
            visited = new boolean[N + 1];
            dfs(arr, i);
        }

        int max = 0;
        for(int i = 1; i <= N; i++) {
            max = Math.max(max, ans[i]);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++) {
            if(max == ans[i]) {
                sb.append(i).append(" ");
            }
        }

        System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
    }

}
