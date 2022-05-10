package com.algo.strings;

import java.util.Scanner;

public class Inflearn111 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        char[] arr = line.toCharArray();
        if(arr.length == 1) {
            System.out.print(arr[0]);
            return;
        }

        for(int i = 0; i < arr.length; i++) {
            char t = arr[i];
            int cnt = 1;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] != t) {
                    i = j - 1;
                    break;
                }
                cnt += 1;
                i = j;
            }

            System.out.print(t);
            if(cnt > 1) {
                System.out.print(cnt);
            }
        }
    }

}
