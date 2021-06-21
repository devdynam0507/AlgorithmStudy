package com.algo.greedy;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class P구명보트 {

    // lv. 3
    public static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int start = 0; int end = people.length - 1;

        while(start <= end) {
            int sum = people[start] + people[end];

            if(sum > limit) {
                --end;
                ++answer;
                continue;
            }
            else {
                --end;
                ++start;
                ++answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] { 70, 50, 80, 50 }, 100 ));
        System.out.println(solution(new int[] { 70, 80, 50 }, 100 ));
        System.out.println(solution(new int[] { 30, 30, 30, 50, 70, 80 }, 100 ));
    }

}
