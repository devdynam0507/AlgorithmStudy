package com.algo.datastructure;

import java.util.*;
import java.io.*;

public class A10866 {

    private static final String PUSH_FRONT = "push_front";
    private static final String PUSH_BACK = "push_back";
    private static final String POP_FRONT = "pop_front";
    private static final String POP_BACK = "pop_back";
    private static final String SIZE = "size";
    private static final String EMPTY = "empty";
    private static final String FRONT = "front";
    private static final String BACK = "back";

    public static void main(String... args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter console = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deque = new LinkedList<>();
        int T = Integer.parseInt(reader.readLine());

        for(int i = 0; i < T; ++i) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            String command = tokenizer.nextToken();
            boolean isEmpty = deque.isEmpty();

            switch (command) {
                case PUSH_FRONT:
                    deque.addFirst(Integer.parseInt(tokenizer.nextToken()));
                    break;
                case PUSH_BACK:
                    deque.addLast(Integer.parseInt(tokenizer.nextToken()));
                    break;
                case POP_FRONT:
                    console.write((isEmpty ? -1 : deque.pollFirst()) + "\n");
                    break;
                case POP_BACK:
                    console.write((isEmpty ? -1 : deque.pollLast()) + "\n");
                    break;
                case SIZE:
                    console.write(deque.size() + "\n");
                    break;
                case EMPTY:
                    console.write((isEmpty ? "1" : "0") + "\n");
                    break;
                case FRONT:
                    console.write((isEmpty ? -1 : deque.peekFirst()) + "\n");
                    break;
                case BACK:
                    console.write((isEmpty ? -1 : deque.peekLast()) + "\n");
                    break;
            }
        }

        console.flush();
    }

}
