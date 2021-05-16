package com.algo.datastructure;

import java.io.*;
import java.util.*;

public class A1874 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(reader.readLine());

        Stack<Integer> output = new Stack<>();
        List<Integer> list = new ArrayList<>();
        int pointer = 0;

        for(int i = 0; i < n; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        for(int i = 1; i <= n; ++i) {
            int top = list.get(pointer);

            // top에 있는 값이랑 같거나 작다면 넣고 또는 같지 않다면 넣는다.
            if(top <= i || top != i) {
                output.push(i);
                sb.append("+\n");
            }

            // top에 있는 값이 스택에 있다면 뽑기
            while (!output.isEmpty() && top == output.peek().intValue()) {
                output.pop();
                sb.append("-\n");

                if (++pointer >= n) {
                    break;
                }

                top = list.get(pointer);
            }
        }

        if(!output.isEmpty()) {
            System.out.println("NO\n");
            return;
        }

        System.out.println(sb.toString());
    }

}