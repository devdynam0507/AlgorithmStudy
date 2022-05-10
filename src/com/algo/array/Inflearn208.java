package com.algo.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Inflearn208 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] p = new int[n];
        scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(scanner.nextLine());
        for(int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(tokenizer.nextToken());
        }

        Map<Integer, Integer> a = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if(a.containsKey(p[i])) {
                System.out.print(a.get(p[i]) + " ");
                continue;
            }

            int stack = 1;
            for(int j = 0; j < n; j++) {
                if(i != j && p[j] > p[i]) {
                    stack += 1;
                }
            }
            a.put(p[i], stack);
            System.out.print(stack + " ");
        }
    }

}
