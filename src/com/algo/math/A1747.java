package com.algo.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1747 {

    public static boolean[] prime = new boolean[1004001];

    public static void makePrime() {
        prime[0] = prime[1] = true;

        for(int i = 2; i < Math.sqrt(prime.length); i++) {
            for(int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        char[] chars = str.toCharArray();

        while(start <= end) {
            if(chars[start] != chars[end]) {
                return false;
            }

            ++start; --end;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        makePrime();

        int i = N;
        while(true) {
            if(!prime[i] && isPalindrome(String.valueOf(i))) {
                System.out.println(i);
                break;
            }
            ++i;
        }
    }

}
