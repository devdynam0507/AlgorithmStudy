package com.algo.twopointer;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Inflearn303 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split(" ");
        int len = Integer.parseInt(firstLine[0]);
        int k = Integer.parseInt(firstLine[1]);
        StringTokenizer tokenizer = new StringTokenizer(scanner.nextLine());
        int[] arr = new int[len];
        for(int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int first = 0;
        int last = k;
        int max = Integer.MIN_VALUE;
        while(last < arr.length) {
            int sum = 0;
            for(int i = first; i < last; i++) {
                sum += arr[i];
            }

            max = Math.max(sum, max);
            ++first;
            ++last;
        }

        System.out.println(max);
    }

}
