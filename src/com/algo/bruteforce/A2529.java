package com.algo.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class A2529 {

    final static int[] arr = {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9
    };

    static boolean[] visit = new boolean[10];

    static List<String> result = new ArrayList<>();
    static String[] exp;
    static int k;

    static void check(int[] arr) {

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 중복 허용 순열
//    static void perm(int depth, int r) {
//        if(depth == r) {
//            for(int i = 0; i < r; i++) {
//                System.out.printf("%d ", select[i]);
//            }
//            System.out.println();
//            return;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            select[depth] = arr[i];
//            perm(depth + 1, r);
//        }
//    }

    static void dfs(int v, int depth, String str) {
        if(depth == k) {
            result.add(str);
            return;
        }
        else {
            for(int i = 0; i <= 9; i++) {
                if(visit[i]) { continue; }
                if(exp[depth].equals("<")) {
                    if(v >= i) { continue; }
                }
                else {
                    if(v <= i) { continue; }
                }

                visit[i] = true;
                dfs(i, depth + 1, str + i);
            }
        }

        visit[v] = false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(reader.readLine());
        exp = reader.readLine().split(" ");

        for(int i = 0; i <= 9; i++) {
            visit[i] = true;
            dfs(i, 0, i + "");
        }

        System.out.println(result.get(result.size() - 1));
        System.out.println(result.get(0));
    }

}
