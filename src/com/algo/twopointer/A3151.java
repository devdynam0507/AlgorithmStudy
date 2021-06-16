package com.algo.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A3151 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine().trim());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }
        Arrays.sort(arr);

        int cnt = 0;
        for(int i = 0; i < N - 2; i++) {
            int left = i + 1, right = N - 1;
            int choice = arr[i];

            if(choice > 0) {
                break;
            }

            while(left < right) {
                int s = choice + arr[left] + arr[right];

                if(s == 0) {
                    if(arr[left] == arr[right]) {
                        if((right - left) % 2 == 0) {
                            cnt += right - left + 1;
                            break;
                        }
                        cnt += right - left;
                        System.out.printf("%d %d %d\n", left, right, right - left);
                        break;
                    }
                    else {
                        int l = 0, r = 0;
                        int lv = arr[left];
                        int rv = arr[right];

                        while (rv == arr[right]) {
                            --right;
                            ++r;
                        }
                        while (lv == arr[left]) {
                            ++left;
                            ++l;
                        }

                        cnt += l * r;
                        System.out.printf("[%d %d,%d,%d] %d x %d = %d\n", i, choice, lv, rv, l, r, l * r);
                    }
                }
                else if(s > 0) {
                    --right;
                }
                else {
                    ++left;
                }
            }
        }

        System.out.println(cnt);
    }

}
