package com.algo.bruteforce;

import java.util.*;

public class P모의고사 {

    static int[] p1 = { 1, 2, 3, 4, 5 };
    static int[] p2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
    static int[] p3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

    static int get(int[] answers, int[] p) {
        int cnt = 0;
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == p[(i + p.length) % p.length]) {
                ++cnt;
            }
        }
        return cnt;
    }

    static int[] solution(int[] answers) {
        int scoreP1 = get(answers, p1);
        int scoreP2 = get(answers, p2);
        int scoreP3 = get(answers, p3);
        PriorityQueue<int[]> integers = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                return o2[1] - o1[1];

            }
        });

        integers.add(new int[] { 1, scoreP1 });
        integers.add(new int[] { 2, scoreP2 });
        integers.add(new int[] { 3, scoreP3 });

        List<Integer> list = new ArrayList<>();
        int[] target = null;
        while(!integers.isEmpty()) {
            int[] arr = integers.poll();

            if(target == null || arr[1] >= target[1]) {
                target = arr;
                list.add(arr[0]);
            }
        }

        Collections.sort(list);
        int[] arr = new int[list.size()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
            System.out.printf("%d ", arr[i]);
        }

        return arr;
    }

    public static void main(String[] args) {
        solution(new int[] { 1, 2, 3, 4, 5 });
        System.out.println();
        solution(new int[] { 1, 3, 2, 4, 2 });
        System.out.println();
        solution(new int[] { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3 });
    }

}
