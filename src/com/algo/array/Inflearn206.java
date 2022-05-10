package com.algo.array;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Inflearn206 {

    static boolean isPrime(int n) {
        if(n == 1) return false;
        for(int i = 2; i <= n - 1; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        StringTokenizer tokenizer = new StringTokenizer(scanner.nextLine());
        StringBuilder builder = new StringBuilder();

        while(tokenizer.hasMoreTokens()) {
            String aa = tokenizer.nextToken();

            for(int i = aa.length() - 1; i >= 0; i--) {
                builder.append(aa.charAt(i));
            }

            int a = Integer.parseInt(builder.toString());
            builder.setLength(0);
            if(isPrime(a)) {
                System.out.print(a + " ");
            }
        }
    }

}
