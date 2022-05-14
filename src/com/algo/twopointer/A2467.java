package com.algo.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A2467 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(reader.readLine());
        int[] waters = new int[len];
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for(int i = 0; i < len; i++) {
            waters[i] = Integer.parseInt(tokenizer.nextToken());
        }

        int p1 = 0;
        int p2 = waters.length - 1;
        int min = Integer.MAX_VALUE;
        int sp1 = waters[p1];
        int sp2 = waters[p2];
        while(p1 < p2) {
            int w = waters[p1] + waters[p2];
            int distance1 = Math.abs(w);
            int distance2 = Math.abs(min);

            if(distance1 <= distance2) {
                min = w;
                sp1 = waters[p1];
                sp2 = waters[p2];
            }

            if(w > 0) {
                p2 -= 1;
            }
            else if(w < 0) {
                p1 += 1;
            }
            else {
                sp1 = waters[p1];
                sp2 = waters[p2];
                break;
            }
        }
        System.out.println(sp1 + " " + sp2);
    }

}
