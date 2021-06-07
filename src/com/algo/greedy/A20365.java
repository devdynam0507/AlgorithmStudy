package com.algo.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A20365 {

    private static final char BLUE = 'B';
    private static final char RED = 'R';

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        char[] arr = reader.readLine().toCharArray();
        arr = (String.valueOf(arr) + "A").toCharArray();
        int r = 1, b = 1;

        for(int i = 0; i < T; i++) {
            if(arr[i] == BLUE) { continue; }
            else if(arr[i] == RED && arr[i + 1] != RED) {
                ++r;
            }
        }

        for(int i = 0; i < T; i++) {
            if(arr[i] == RED) { continue; }
            else if(arr[i] == BLUE && arr[i + 1] != BLUE) {
                ++b;
            }
        }

        System.out.println(Math.min(b, r));
    }

}
