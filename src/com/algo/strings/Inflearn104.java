package com.algo.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inflearn104 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());

        for(int i = 0; i < N; i ++) {
            char[] word = reader.readLine().toCharArray();

            for(int j = word.length - 1; j >= 0; j--) {
                System.out.print(word[j]);
            }
            System.out.println();
        }
    }

}
