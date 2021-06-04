package com.algo.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1343 {

    private static int cover(StringBuilder sb, int cover) {
        while(cover % 2 == 0 && cover > 0) {
            if(cover > 2) {
                cover -= 4;
                sb.append("AAAA");
            } else {
                cover -= 2;
                sb.append("BB");
            }
        }

        return cover;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] chars = reader.readLine().toCharArray();
        int cover = 0;

        for(char ch : chars) {
            if (ch == 'X') {
                ++cover;
            }
            else if(ch == '.') {
                cover = cover(sb, cover);

                if(cover > 0) {
                    System.out.println(-1);
                    return;
                }

                sb.append(".");
            }
        }

        cover = cover(sb, cover);
        if(cover > 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(sb.toString());
    }

}
