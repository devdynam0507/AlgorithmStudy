package com.algo.graphtraversal;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A2667 {

    static boolean[][] visit;
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };
    static int cnt = 0;
    static int N;

    public static void dfs(int[][] arr, int x, int y) {
        visit[y][x] = true;
        cnt++;

        for(int i = 0; i < 4; i++) {
            int xx = x + dx[i];
            int yy = y + dy[i];
            if((xx < 0 || xx >= N || yy < 0 || yy >= N)) {
                continue;
            }

            if(!visit[yy][xx] && arr[yy][xx] == 1) {
                dfs(arr, xx, yy);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(reader.readLine());
        visit = new boolean[N][N];
        int[][] arr = new int[N][N];

        for(int i = 0; i < N; i++) {
            char[] ch = reader.readLine().toCharArray();

            for(int j = 0; j < N; j++) {
                arr[i][j] = ch[j] - '0';
            }
        }

        int apt = 0;
        List<Integer> list = new ArrayList<>();
        for(int y = 0; y < N; y++) {
            for(int x = 0; x < N; x++) {
                if(arr[y][x] == 1 && !visit[y][x]) {
                    ++apt;
                    dfs(arr, x, y);
                    list.add(cnt);
                    cnt = 0;
                }
            }
        }
        Collections.sort(list);
        writer.write(apt + "\n");

        for(int i : list) {
            writer.write(i + "\n");
        }

        writer.flush();
    }

}
