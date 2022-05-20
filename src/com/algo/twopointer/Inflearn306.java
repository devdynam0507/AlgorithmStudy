package com.algo.twopointer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Inflearn306 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringTokenizer tokenizer = new StringTokenizer(scanner.nextLine());
        int N = Integer.parseInt(tokenizer.nextToken());
        int M = Integer.parseInt(tokenizer.nextToken());
        tokenizer = new StringTokenizer(scanner.nextLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

    }

}
