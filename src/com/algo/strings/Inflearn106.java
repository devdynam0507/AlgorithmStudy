package com.algo.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inflearn106 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuilder builder = new StringBuilder();
        Map<Integer, Boolean> visit = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {
            if(visit.containsKey(i)) {
                continue;
            }

            for(int j = i + 1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    visit.put(j, true);
                }
            }
            builder.append(str.charAt(i));
        }

        System.out.println(builder.toString());
    }

}
