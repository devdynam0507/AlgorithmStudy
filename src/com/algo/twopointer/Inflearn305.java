package com.algo.twopointer;

import java.util.Scanner;

public class Inflearn305 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        // N 보다 작을 때 rp 이동
        // N 보다 클 때 lp 이동
        // 합 검사 했을 때 N 이랑 같으면 cnt 증가
        int rp = 1;
        int lp = 2;
        int cnt = 0;
        int sum = rp + lp;
        while(rp <= N / 2 + 1) {
            //            System.out.println(lp + " " + rp + " " + sum);
            if(sum < N || lp == rp) {
                lp ++;
                sum += lp;
            }
            else if(sum > N) {
                sum -= rp++;
            }
            else {
                lp ++;
                sum += lp;
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}
