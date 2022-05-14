package com.algo.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A3273 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arrLen = Integer.parseInt(reader.readLine());
        int[] arr = new int[arrLen];
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int X = Integer.parseInt(reader.readLine());
        for(int i = 0; i < arrLen; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }
        Arrays.sort(arr);

        int cnt = 0;
        // 1 2 3 5 7 9 10 11 12
        int p1 = 0;
        int p2 = arr.length - 1;
        while(p2 > p1) {
            int sum = arr[p1] + arr[p2];

            if(sum == X) {
                cnt += 1;
                p1 ++;
                p2 --;
            }
            if(sum > X) {
                p2--;
            }
            else if(sum < X) {
                p1++;
            }
        }

        System.out.println(cnt);
    }

}
