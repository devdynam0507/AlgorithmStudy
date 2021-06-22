package com.algo.graphtraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class P네트워크 {

    static boolean[] visit;
    static int N;
    static int[][] matrix;
    static int network = 0;

    static void dfs(int[][] computers, int x) {
        visit[x] = true;
        for(int i = 0; i < N; i++) {
            System.out.println(x + " " + i);
            if(computers[x][i] == 1 && !visit[i] && x != i) {
                System.out.println("run: " + i);
                visit[i] = true;
                dfs(computers, i);
            }
            else if(x == i) {
                visit[i] = true;
            }
        }
    }

    static int solution(int n, int[][] computers) {
        N = n;
        visit = new boolean[N + 1];
        matrix = new int[N+1][N+1];

        for(int i = 0; i < n; i++) {
            if(!visit[i]) {
                dfs(computers, i);
                System.out.println();
                ++network;
            }
        }

        return network;
    }

    public static void main(String[] args) {
        //solution(3, new int[][] { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } });
        solution(3, new int[][] { { 1, 1, 0 }, { 1, 1, 1 }, { 0, 1, 1 } });
    }

}
