package com.algo.datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class A1158 {

    private static String calc(List<Integer> list, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int n = 0, i = 0; // n = 증가 카운트, i 현재 인덱스 값
        int len = list.size();

        sb.append("<");
        while(len != 0) {
            if(i >= len || i < 0) {
                i = 0;
            }
            if(n > 0 && n % k == 0) {
                Integer pop = stack.pop();
                list.remove(pop);
                sb.append(pop).append(", ");
                --len; --i;
                n = 0;
                continue;
            }
            stack.push(list.get(i));
            ++n; ++i;
        }
        sb.deleteCharAt(sb.length() - 1).deleteCharAt(sb.length() - 1).append(">\n");

        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter consoleWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();

        String[] split = reader.readLine().split(" ");
        int k = Integer.parseInt(split[1]);
        int len = Integer.parseInt(split[0]);
        for(int i = 0; i < len; i++) {
            list.add(i + 1);
        }

        consoleWriter.write(calc(list, k));

        consoleWriter.flush();
        consoleWriter.close();
        reader.close();
    }


}
