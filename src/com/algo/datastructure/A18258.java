package com.algo.datastructure;

import java.util.*;
import java.io.*;

public class A18258 {

    private static final String PUSH = "push";
    private static final String POP = "pop";
    private static final String FRONT = "front";
    private static final String BACK = "back";
    private static final String SIZE = "size";
    private static final String EMPTY = "empty";

    public static void main(String... args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter consoleWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> queue = new LinkedList<>();

        final int T = Integer.parseInt(reader.readLine());

        for(int i = 0; i < T; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            String command = tokenizer.nextToken();
            boolean isEmpty = queue.isEmpty();

            switch (command) {
                case PUSH:
                    queue.addLast(Integer.parseInt(tokenizer.nextToken()));
                    break;
                case POP:
                    consoleWriter.write((isEmpty ? "-1" : queue.pollFirst()) + "\n");
                    break;
                case SIZE:
                    consoleWriter.write(queue.size() + "\n");
                    break;
                case EMPTY:
                    consoleWriter.write((queue.isEmpty() ? 1 : 0) + "\n");
                    break;
                case FRONT:
                    consoleWriter.write((isEmpty ? "-1" : queue.getFirst())+ "\n");
                    break;
                case BACK:
                    consoleWriter.write((isEmpty ? "-1" : queue.getLast())+ "\n");
                    break;
            }
        }

        consoleWriter.flush();
    }

}
