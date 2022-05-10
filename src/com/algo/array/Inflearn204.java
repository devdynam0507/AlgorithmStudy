package com.algo.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inflearn204 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> fibo = new ArrayList<>();
        fibo.add(1);
        fibo.add(1);

        int idx = 2;
        while(fibo.size() < N) {
            int sum = fibo.get(idx - 2) + fibo.get(idx - 1);
            fibo.add(sum);
            idx ++;
        }
        System.out.println(fibo.stream().map(i -> String.valueOf(i)).collect(Collectors.joining(" ")));
    }

}
