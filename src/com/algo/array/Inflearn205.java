package com.algo.array;

import java.util.*;

public class Inflearn205 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N + 1];
        for(int i = 2; i <= N; i++) {
            arr[i] = i;
        }

        for(int i = 2; i <= N; i++) {
            if(arr[i] == 0) {
                continue;
            }

            for(int j = i + i; j <= N; j += i) {
                arr[j] = 0;
            }
        }

        int cnt = 0;
        for(int i = 2; i <= N; i++) {
            if(arr[i] != 0) {
                cnt += 1;
            }
        }

        System.out.println(cnt);
    }

}
