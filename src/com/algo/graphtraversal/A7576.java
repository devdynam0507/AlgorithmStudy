package com.algo.graphtraversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A7576 {

    static boolean[][] visit;
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };
    static int X, Y;

    public static boolean isRipeAll(int[][] arr) {
        for(int i = 0; i < Y; i++) {
            for(int j = 0; j < X; j++) {
                if(!visit[i][j] && arr[i][j] == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static int bfs(int[][] arr, List<int[]> list) {
        Queue<int[]> queue = new LinkedList<>();
        for(int[] l : list) {
            visit[l[1]][l[0]] = true;
            queue.add(l);
        }

        int last = 0;
        while(!queue.isEmpty()) {
            int[] poll = queue.poll();

            for (int i = 0; i < 4; i++) {
                int xx = poll[0] + dx[i];
                int yy = poll[1] + dy[i];
                if ((xx < 0 || xx >= X || yy < 0 || yy >= Y)) {
                    continue;
                }
                if (arr[yy][xx] == -1 || visit[yy][xx]) {
                    continue;
                }

                arr[yy][xx] = arr[poll[1]][poll[0]] + 1;
                last = arr[poll[1]][poll[0]] + 1;
                visit[yy][xx] = true;

                queue.offer(new int[]{xx, yy});
            }

        }

        return last;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        X = Integer.parseInt(tokenizer.nextToken());
        Y = Integer.parseInt(tokenizer.nextToken());
        int[][] arr = new int[Y][X];
        visit = new boolean[Y][X];

        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < Y; i++) {
            tokenizer = new StringTokenizer(reader.readLine());

            for(int j = 0; j < X; j++) {
                arr[i][j] = Integer.parseInt(tokenizer.nextToken());

                if(arr[i][j] == 1) {
                    list.add(new int[] { j, i });
                }
            }
        }

        int result = bfs(arr, list);
        if(result - 1 < 0) { result = 0; }
        else { result -= 1; }

        if(!isRipeAll(arr)) { result = -1; }
        System.out.println(result);
    }

}
