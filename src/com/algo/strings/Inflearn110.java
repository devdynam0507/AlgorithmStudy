package com.algo.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inflearn110 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lines = scanner.nextLine().split(" ");
        String s = lines[0];
        char t = lines[1].charAt(0);

        List<Integer> pointsOfT = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t) {
                pointsOfT.add(i);
            }
        }

        for(int i = 0; i < s.length(); i++) {
            int min = -1;
            for(int j = 0; j < pointsOfT.size(); j ++) {
                int distance = Math.abs(i - pointsOfT.get(j));

                if(min == -1 || min > distance) {
                    min = distance;
                }
            }
            System.out.print(min + " ");
        }
    }
}
