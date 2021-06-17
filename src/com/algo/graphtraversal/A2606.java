package com.algo.graphtraversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2606 {

    public static boolean[] visit;
    public static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int edge = Integer.parseInt(reader.readLine());
        int[][] arr = new int[n + 1][n + 1];
        visit = new boolean[n + 1];

        for(int i = 0; i < edge; i++) {
            String[] split = reader.readLine().split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);

            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        dfs(arr, 1);
        System.out.println(cnt - 1);
    }

    public static void dfs(int[][] arr, int n) {
        if(visit[n]) { return; }

        visit[n] = true;
        ++cnt;

        for(int i = 0; i < arr[n].length; i++) {
            if(arr[n][i] == 1 && !visit[i]) {
                dfs(arr, i);
            }
        }
    }
}
