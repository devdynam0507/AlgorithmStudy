package com.algo.graphtraversal;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A1260 {

    static boolean[] visited;
    static BufferedWriter writer;

    public static void dfs(int[][] arr, int v, StringBuilder sb) throws IOException {
        if(visited[v]) { return; }

        visited[v] = true;
        sb.append(v).append(" ");

        for(int i = 0; i < arr[v].length; i++) {
            if(arr[v][i] == 1 && !visited[i]) {
                dfs(arr, i, sb);
            }
        }
    }

    public static void bfs(int[][] arr, int v, StringBuilder sb) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        int n = arr.length - 1;

        queue.offer(v);
        visited[v] = true;

        while(!queue.isEmpty()) {
            v = queue.poll();
            sb.append(v).append(" ");

            for(int i = 1; i < arr[v].length; i++) {
                if(arr[v][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int edge = Integer.parseInt(tokenizer.nextToken());
        int v = Integer.parseInt(tokenizer.nextToken());
        StringBuilder sb = new StringBuilder();

        visited = new boolean[n + 1];
        int[][] arr = new int[n + 1][n + 1];

        for(int i = 0; i < edge; i++) {
            String[] split = reader.readLine().split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);

            arr[a][b] = arr[b][a] = 1;
        }

        dfs(arr, v, sb);
        visited = new boolean[n + 1];
        sb.deleteCharAt(sb.length() - 1).append("\n");
        bfs(arr, v, sb);

        System.out.println(sb.toString());
    }

}
