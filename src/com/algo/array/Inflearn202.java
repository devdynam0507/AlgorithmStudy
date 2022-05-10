package com.algo.array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Inflearn202 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int[] arr = new int[n];
        StringTokenizer tokenizer = new StringTokenizer(in.nextLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int cnt = 1;
        for(int i = 1; i < arr.length; i ++) {
            boolean check = true;
            for(int j = 0; j < i; j ++) {
                if(arr[i] <= arr[j]) {
                    check = false;
                    break;
                }
            }

            if(check) {
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }

}
