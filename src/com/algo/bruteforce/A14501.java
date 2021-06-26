package com.algo.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A14501 {

    static int N, result;

    public static void dfs(int[][] arr, int index, int pay) {
        if(index >= N) {
            result = Math.max(result, pay);
            return;
        }

        if(index + arr[index][0] <= N) {
            dfs(arr, index + arr[index][0], pay + arr[index][1]);
        }
        else {
            dfs(arr, index + arr[index][0], pay);
        }

        dfs(arr, index + 1, pay);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(reader.readLine());
        result = 0;
        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            arr[i][0] = Integer.parseInt(tokenizer.nextToken());
            arr[i][1] = Integer.parseInt(tokenizer.nextToken());
        }

        dfs(arr, 0, 0);

        System.out.println(result);
    }

}
