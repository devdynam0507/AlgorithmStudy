package com.algo.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class A10799 {

    private static final char OPEN = '(';

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] pipes = reader.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        int result = 0;

        for(int i = 0; i < pipes.length; i++) {
            if(pipes[i] == OPEN) {
                stack.push(pipes[i]);
            } else {
                if(pipes[i - 1] == OPEN) {
                    stack.pop();
                    result += stack.size();
                } else {
                    stack.pop();
                    ++result;
                }
            }
        }

        System.out.println(result);
    }

}
