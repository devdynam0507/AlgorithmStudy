package com.algo.datastructure;

import java.util.*;
import java.io.*;

public class A9012 {

    private static final char OPENED_PARENTHESIS = '(';
    private static final String YES = "YES\n";
    private static final String NO = "NO\n";

    private static String calc(char[] arr, Stack<Character> stack) throws IOException {
        for(char c : arr) {
            if(c == OPENED_PARENTHESIS) {
                stack.push(c);
            } else {
                boolean flag = false;
                while(!stack.isEmpty()) {
                    if(stack.pop() == OPENED_PARENTHESIS) {
                        flag = true;
                        break;
                    }
                }

                if(!flag) { return NO; }
            }
        }

        int s = stack.size();
        stack.clear();
        if(s == 0) { return YES; }
        else { return NO; }
    }

    public static void main(String... args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter consoleWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stack = new Stack<>();
        final int T = Integer.parseInt(reader.readLine());

        for(int i = 0; i < T; ++i) {
            char[] arr = reader.readLine().toCharArray();

            consoleWriter.write(calc(arr, stack));
        }

        consoleWriter.flush();
    }

}
