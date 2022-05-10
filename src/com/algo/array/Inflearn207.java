package com.algo.array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Inflearn207 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(scanner.nextLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int before = 0;
        int sum = 0;
        int stack = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                stack += 1;
                sum += stack;
            }
            else {
                stack = 0;
            }
        }

        System.out.println(sum);
    }

}
