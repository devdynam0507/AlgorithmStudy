package com.algo.datastructure;

import java.util.*;
import java.io.*;

public class A2164 {

    public static void main(String... args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new LinkedList<>();
        int n = Integer.parseInt(reader.readLine());

        for(int i = 1; i <= n; ++i) {
            deque.addLast(i);
        }

        int len = n;
        boolean isDesert = true; //이번턴에 버리는 카드인지 옮기는 카드인지 구분하는 flags
        while(len != 1) {
            if(isDesert) {
                deque.pollFirst();

                --len;
            } else {
                int poll = deque.pollFirst();
                deque.addLast(poll);
            }

            isDesert = !isDesert;
        }

        System.out.println(deque.poll());
    }

}
