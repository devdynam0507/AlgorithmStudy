package com.algo.array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Inflearn203 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        StringTokenizer tokenizer1 = new StringTokenizer(in.nextLine());
        StringTokenizer tokenizer2 = new StringTokenizer(in.nextLine());

        for(int i = 0; i < N; i ++) {
            int a = Integer.parseInt(tokenizer1.nextToken());
            int b = Integer.parseInt(tokenizer2.nextToken());

            if(a == b) {
                System.out.println("D");
            }
            else if(a == 1 && b == 3) {
                System.out.println("A");
            }
            else if(a == 2 && b == 1) {
                System.out.println("A");
            }
            else if(a == 3 && b == 2) {
                System.out.println("A");
            }
            else {
                System.out.println("B");
            }
        }
    }

}
