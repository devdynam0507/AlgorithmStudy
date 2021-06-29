package com.algo.graphtraversal;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class A10026 {

    static final int R = 1;
    static final int G = 2;
    static final int B = 3;
    static final Map<Character, Integer> rgbMap = new HashMap<>();
    static final Map<Integer, Integer> rgbMapReverse = new HashMap<>();
    static boolean[][] visit;
    static int[][] grid;
    static int[] dx = new int[] { 1, -1, 0, 0 };
    static int[] dy = new int[] { 0, 0, 1, -1 };
    static int N;

    static void init() {
        rgbMap.put('R', R);
        rgbMap.put('G', G);
        rgbMap.put('B', B);

        rgbMapReverse.put(R, R);
        rgbMapReverse.put(G, G);
        rgbMapReverse.put(B, B);
    }

    static void dfs1(int x, int y, int color) {
        if(visit[y][x]) {
            return;
        }

        visit[y][x] = true;
        for(int i = 0; i < 4; i++) {
            int xx = x + dx[i];
            int yy = y + dy[i];

            if(xx < 0 || yy < 0 || yy >= N || xx >= N) {
                continue;
            }
            if(visit[yy][xx] || rgbMapReverse.get(grid[yy][xx]) != color) {
                continue;
            }

            dfs1(xx, yy, color);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(reader.readLine());
        grid = new int[N][N];
        visit = new boolean[N][N];
        init();

        for(int y = 0; y < N; y++) {
            char[] arr = reader.readLine().toCharArray();
            for(int x = 0; x < N; x++) {
                grid[y][x] = rgbMap.get(arr[x]);
            }
        }

        int cnt = 0;
        for(int y = 0; y < N; y++) {
            for(int x = 0; x < N; x++) {
                if(!visit[y][x]) {
                    dfs1(x, y, grid[y][x]);
                    ++cnt;
                }
            }
        }
        rgbMapReverse.put(G, R); // red, green 합치기
        writer.write(cnt + " ");
        cnt = 0;
        visit = new boolean[N][N];

        for(int y = 0; y < N; y++) {
            for(int x = 0; x < N; x++) {
                if(!visit[y][x]) {
                    dfs1(x, y, rgbMapReverse.get(grid[y][x]));
                    ++cnt;
                }
            }
        }
        writer.write(cnt + "");
        writer.flush();
    }

}
