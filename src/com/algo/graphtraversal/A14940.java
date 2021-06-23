package com.algo.graphtraversal;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class A14940 {

    static final int GOAL = 2;
    static boolean[][] visit;
    static int[][] map;
    static int[] goalCoordinate;

    static int X, Y;

    static int[] dx = new int[] { 1, -1, 0, 0 };
    static int[] dy = new int[] { 0, 0, 1, -1 };

    public static class Move {
        public int x, y;
        public int cnt;

        public Move(int x, int y) {
            this.x = x;
            this.y = y;
            this.cnt = 0;
        }
    }

    static void bfs(Move move) {
        Queue<Move> queue = new LinkedList<>();
        queue.offer(move);

        map[move.y][move.x] = 0;
        visit[move.y][move.x] = true;

        while(!queue.isEmpty()) {
            Move poll = queue.poll();

            for(int i = 0; i < 4; i++) {
                int x = dx[i] + poll.x;
                int y = dy[i] + poll.y;
                if(x < 0 || x >= X || y < 0 || y >= Y) { continue; }
                if(map[y][x] == 0 || visit[y][x]) { continue; }

                Move n = new Move(x, y);
                map[y][x] = poll.cnt + 1;
                n.cnt = map[y][x];
                visit[y][x] = true;

                queue.offer(n);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        Y = Integer.parseInt(tokenizer.nextToken());
        X = Integer.parseInt(tokenizer.nextToken());
        map = new int[Y][X];
        visit = new boolean[Y][X];
        goalCoordinate = new int[2];

        for(int i = 0; i < Y; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            for(int j = 0; j < X; j++) {
                map[i][j] = Integer.parseInt(tokenizer.nextToken());

                if(map[i][j] == GOAL) {
                    goalCoordinate[0] = j; //x
                    goalCoordinate[1] = i; //y
                }
            }
        }

        bfs(new Move(goalCoordinate[0], goalCoordinate[1]));
        for(int y = 0; y < Y; y++) {
            for(int x = 0; x < X; x++) {
                if(!visit[y][x] && map[y][x] != 0) {
                    writer.write("-1 ");
                }
                else {
                    writer.write(map[y][x]+  " ");
                }
            }
            writer.flush();
            writer.write("\n");
        }
    }

}
