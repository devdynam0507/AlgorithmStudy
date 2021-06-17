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

        long cnt = 0;
        for(int i = 0; i < N - 2; i++) {
            int left = i + 1, right = N - 1;
            int choice = arr[i];

            if(choice > 0) {
                break;
            }

            while(left < right) {
                long s = choice + arr[left] + arr[right];

                if(s == 0) {
                    if(arr[left] == arr[right]) {
                        cnt += (right - left + 1) * (long) (right - left) / 2;
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

                        cnt += l * (long) r;
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
