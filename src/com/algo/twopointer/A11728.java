package com.algo.twopointer;

import java.io.*;
import java.util.StringTokenizer;

public class A11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer arrTokenizer = new StringTokenizer(reader.readLine());
        StringTokenizer nt = new StringTokenizer(reader.readLine());
        StringTokenizer mt = new StringTokenizer(reader.readLine());
        int[] N = new int[Integer.parseInt(arrTokenizer.nextToken())];
        int[] M = new int[Integer.parseInt(arrTokenizer.nextToken())];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N.length; i++) {
            N[i] = Integer.parseInt(nt.nextToken());
        }
        for(int i = 0; i < M.length; i++) {
            M[i] = Integer.parseInt(mt.nextToken());
        }

        int i = 0, j =0;
        while(i < N.length && j < M.length) {
            int t1 = N[i];
            int t2 = M[j];

            if(t1 > t2) {
                ++j;
                sb.append(t2).append(" ");
            }
            else {
                ++i;
                sb.append(t1).append(" ");
            }
        }

        if(i < N.length) {
            for(; i < N.length; i++) {
                sb.append(N[i]).append(" ");
            }
        }

        if(j < M.length) {
            for(; j < M.length; j++) {
                sb.append(M[j]).append(" ");
            }
        }
        sb.deleteCharAt(sb.length() - 1);

        writer.write(sb.toString());
        writer.flush();
    }
}
