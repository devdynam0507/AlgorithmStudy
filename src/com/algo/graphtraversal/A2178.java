package com.algo.graphtraversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A2178 {

    static int N, M;
    static boolean visited[][];

    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };

    public static void bfs(int[][] arr, int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{ x, y });
        visited[y][x] = true;

        while(!queue.isEmpty()) {
            int[] poll = queue.poll();

            for(int i = 0; i < 4; i++) {
                int xx = dx[i] + poll[0];
                int yy = dy[i] + poll[1];
                if((xx < 0 || xx >= M || yy < 0 || yy >= N)) {
                    continue;
                }
                if(visited[yy][xx] || arr[yy][xx] == 0) {
                    continue;
                }

                arr[yy][xx] = arr[poll[1]][poll[0]] + 1;
                visited[yy][xx] = true;
                queue.offer(new int[] { xx, yy });
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        N = Integer.parseInt(tokenizer.nextToken());
        M = Integer.parseInt(tokenizer.nextToken());
        visited = new boolean[N][M];
        int[][] arr = new int[N][M];

        for(int i = 0; i < N; i++) {
            char[] toChars = reader.readLine().toCharArray();

            for(int j = 0; j < M; j++) {
                arr[i][j] = toChars[j] - '0';
            }
        }

        bfs(arr, 0, 0);
        System.out.println(arr[N-1][M-1]);
    }
}
