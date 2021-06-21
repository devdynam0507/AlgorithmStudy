package com.algo.bruteforce;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P소수찾기 {

    public static boolean[] visit;

    static public void dfs(Set<Integer> set, String str, String numbers, int index) {
        int n = numbers.length();

        if(!str.isEmpty()) {
            set.add(Integer.parseInt(str));
        }

        for(int i = 0; i < n; i++) {
            if(visit[i]) {
                continue;
            }

            visit[i] = true;
            dfs(set, str + numbers.charAt(i), numbers, index + 1);
            //[1, 193, 931, 3, 39, 391, 9, 139, 13, 913, 19, 91, 93, 31, 319]
            visit[i] = false;
        }
    }

    static public boolean isPrime(int i) {
        if(i <= 1) { return false; }
        if(i == 2 || i == 3) { return true; }

        for(int k=2; k<=(int)Math.sqrt(i); k++) {
            if(i % k == 0) { return false; }
        }

        return true;
    }

    static int solution(String numbers) {
        Set<Integer> set = new HashSet<>();
        visit = new boolean[numbers.length()];
        dfs(set, "", numbers, 0);
        Iterator<Integer> iterator = set.iterator();
        int answer = 0;

        while(iterator.hasNext()) {
            int n = iterator.next(); iterator.remove();

            if(n % 2 != 0 && isPrime(n)) {
                ++answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("17"));
        System.out.println(solution("011"));
        System.out.println(solution("931"));
        System.out.println(solution("9313"));
    }

}

