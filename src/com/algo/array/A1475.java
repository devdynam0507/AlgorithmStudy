package com.algo.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1475 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = reader.readLine().replace("9", "6").toCharArray();
        int[] set = new int[10];

        for(char ch : chars) {
            set[ch - '0']++;
        }

        set[6] = Math.round(set[6] / 2.0f);

        int max = 0;
        for(int i = 0; i <= 9; i++) {
            if(max < set[i]) {
                max = set[i];
            }
        }
        System.out.println(max);
    }

}
