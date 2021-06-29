package com.algo.graphtraversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2636 {

    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };
    static int[][] map;
    static int N, M;
    static int cnt = 0;
    static boolean[][] visited;
    static boolean[][] check;

    // 가장자리 check
    static void dfs(int x, int y) {
        if(map[y][x] != 0) {
            return;
        }

        for(int i = 0; i < 4; i++) {
            int xx = x + dx[i];
            int yy = y + dy[i];

            if(xx < 0 || yy < 0 || yy >= N || xx >= M) {
                continue;
            }
            if(visited[yy][xx] || check[yy][xx]) {
                continue;
            }
            if(map[yy][xx] != 0) {
                visited[yy][xx] = true;
                check[yy][xx] = true;
                cnt += 1;
            }
            else if(map[yy][xx] == 0){
                visited[yy][xx] = true;
                dfs(xx, yy);
            }
        }
    }

    static int handle() {
        int cnt = 0;
        for(int y = 0; y < N; y++) {
            for(int x = 0; x < M; x++) {
                if(visited[y][x]) {
                    visited[y][x] = true;
                 }
                if(check[y][x]) {
                    map[y][x] = 0;
                    check[y][x] = false;
                    ++cnt;
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        N = Integer.parseInt(tokenizer.nextToken()); // height
        M = Integer.parseInt(tokenizer.nextToken()); // weight
        map = new int[N][M];
        visited = new boolean[N][M];
        check = new boolean[N][M];

        for(int y = 0; y < N; y++) {
            tokenizer = new StringTokenizer(reader.readLine());
            for(int x = 0; x < M; x++) {
                map[y][x] = Integer.parseInt(tokenizer.nextToken());
            }
        }

        int k = 0;
        while(++k > 0) {
            dfs(0, 0);
            int c = handle();
            visited = new boolean[N][M];
            check = new boolean[N][M];

            if(c == 0) {
                --k;
                break;
            }
            else {
                cnt = c;
            }
        }

        System.out.println(k);
        System.out.println(cnt);
    }

}
