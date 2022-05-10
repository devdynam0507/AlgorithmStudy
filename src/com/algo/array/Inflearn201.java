package com.algo.array;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inflearn201 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        List<Integer> list = Arrays.asList(in.nextLine().split(" ")).stream()
                .map(i -> Integer.parseInt(i)).collect(Collectors.toList());

        System.out.print(list.get(0) + " ");
        for(int i = 1; i < N; i++) {
            if(list.get(i) > list.get(i - 1)) {
                System.out.print(list.get(i) + " ");
            }
        }
    }

}
