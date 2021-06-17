package com.algo.graphtraversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class A11725 {

    static boolean[] visited;
    static StringBuilder sb;
    static int[] c;

    public static void dfs(int[][] arr, int v) {
        if(visited[v]) { return; }

        visited[v] = true;
        for(int i = 0; i < arr[v].length; i++) {
            if(arr[v][i] == 1 && !visited[i]) {
                c[i] = v;
                dfs(arr, i);
            }
        }
    }

    public static void bfs(LinkedList<Integer>[] link, int v) {
        Queue<Integer> queue = new LinkedList<>();

        visited[v] = true;
        queue.offer(v);

        while(!queue.isEmpty()) {
            v = queue.poll();
            Iterator<Integer> iterator = link[v].listIterator();

            while(iterator.hasNext()) {
                int p = iterator.next();

                if(!visited[p]) {
                    c[p] = v;
                    visited[p] = true;
                    queue.add(p);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        LinkedList<Integer>[] link = new LinkedList[n + 1];
        visited = new boolean[n + 1];
        sb = new StringBuilder();
        c = new int[n + 1];

        for(int i = 0; i < n + 1; i++) {
            link[i] = new LinkedList<>();
        }

        for(int i = 0; i < n - 1; i++) {
            String[] split = reader.readLine().split(" ");
            int x = Integer.parseInt(split[0]);
            int y = Integer.parseInt(split[1]);

            link[x].add(y);
            link[y].add(x);
        }

        bfs(link, 1);
        for(int i = 2; i < n + 1; i++) {
            sb.append(c[i]).append("\n");
        }

        System.out.println(sb);
    }
}
