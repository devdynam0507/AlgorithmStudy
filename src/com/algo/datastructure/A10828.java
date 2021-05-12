package com.algo.datastructure;

import java.util.*;
import java.io.*;

public class A10828 {

    public static void main(String... args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter consoleWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int T = Integer.parseInt(reader.readLine());

        for(int i = 0; i < T; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            String command = tokenizer.nextToken();
            int v = -1;
            boolean isEmpty = stack.isEmpty();
            if(tokenizer.hasMoreTokens()) {
                v = Integer.parseInt(tokenizer.nextToken());
            }

            switch (command) {
                case "push":
                    stack.push(v);
                    break;
                case "top":
                    consoleWriter.write((isEmpty ? "-1" : String.valueOf(stack.peek())) + "\n");
                    break;
                case "pop":
                    consoleWriter.write((isEmpty ? "-1" : String.valueOf(stack.pop())) + "\n");
                    break;
                case "size":
                    consoleWriter.write(String.valueOf(stack.size()) + "\n");
                    break;
                case "empty":
                    consoleWriter.write((isEmpty ? "1" : "0") + "\n");
                    break;
            }
        }

        consoleWriter.flush();
    }

}
