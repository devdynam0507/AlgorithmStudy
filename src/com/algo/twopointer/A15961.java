package com.algo.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A15961 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(tokenizer.nextToken()); // 회전초밥 벨트에 놓은 접시의 수
        int d = Integer.parseInt(tokenizer.nextToken()); // 초밥의 가짓수
        int k = Integer.parseInt(tokenizer.nextToken()); // 연속해서 먹는 접시의 수
        int c = Integer.parseInt(tokenizer.nextToken()); // 쿠폰번호
        int[] arr = new int[N];
        int[] visited = new int[d + 1];
        for(int i = 0; i < N; i++) {
            int sushi = Integer.parseInt(reader.readLine());
            arr[i] = sushi;
        }

        //먼저 k개의 스시를 먹는다.
        int cnt = 0; int max = 0;
        for(int i = 0; i < k; i++) {
            if(visited[arr[i]] == 0) {
                ++cnt;
            }
            visited[arr[i]]++;
        }
        max = visited[c] == 0 ? cnt + 1 : cnt;

        for(int i = 0; i < N - 1; i++) {
            int front = arr[i];
            int tail = arr[(i + k) % N];
            visited[front]--;
            if(visited[front] == 0) {
                --cnt;
            }
            if(visited[tail] == 0) {
                ++cnt;
            }
            visited[tail]++;

            if(visited[c] == 0) {
                max = Math.max(max, cnt + 1);
            }
            else {
                max = Math.max(max, cnt);
            }
        }

        System.out.println(max);
    }

}
