package com.algo.twopointer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Inflearn304 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer tok1 = new StringTokenizer(sc.nextLine());
        int N = Integer.parseInt(tok1.nextToken());
        int M = Integer.parseInt(tok1.nextToken());
        StringTokenizer tok2 = new StringTokenizer(sc.nextLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(tok2.nextToken());
        }

        int cnt = 0;
        int p1 = 0;
        int p2 = 0;
        int sum = 0;
        for(; p2 < N; p2++) {
            sum += arr[p2];
            if(sum == M) cnt += 1;
            while(sum >= M) {
                sum -= arr[p1++];
                if(sum == M) {
                    cnt += 1;
                }
            }
        }
        System.out.println(cnt);
    }

}
