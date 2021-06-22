package com.algo.bruteforce;

import java.util.ArrayList;
import java.util.List;

public class P카펫 {

    static int size;
    static int target;
    static boolean visit[];
    static int bbrown, yyellow;
    static List<int[]> list = new ArrayList<>();

    static void dfs(int pos) {
        if(pos > target) {
            return;
        }
        if(visit[pos]) {
            return;
        }

        for(int i = 1; i <= pos; i++) {
            if(pos * i == size && (pos - 2) * (i - 2) == yyellow) {
                list.add(new int[] { pos, i });
                return;
            }
        }

        for(int i = pos; i <= target; i++) {
            visit[i] = true;
            dfs(i + 1);
        }
    }

    static int[] solution(int brown, int yellow) {
        int[] answer = {};
        bbrown = brown;
        yyellow = yellow;
        size = brown + yellow;
        target = (int) Math.ceil((double) size / 2.0);
        visit = new boolean[2500000];

        dfs(1);

        list.forEach(i -> {
            System.out.printf("%d x %d = %d\n", i[0], i[1], i[0] * i[1]);
        });
        list.clear();

        return null;
    }

    public static void main(String[] args) {
        solution(10, 2);
        solution(8, 1);
        solution(24, 24);
        solution(50, 22);
    }

}
