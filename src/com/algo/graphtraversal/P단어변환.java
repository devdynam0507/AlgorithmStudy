package com.algo.graphtraversal;

public class P단어변환 {

    static String[] wwords;
    static String[] visit;
    static boolean success = false;
    static int cnt = 0;

    static void dfs(String begin, String target, int index) {
        if(index == wwords.length) {
            return;
        }


    }

    static int solution(String begin, String target, String[] words) {
        int answer = 0;
        wwords = words;
        visit = new String[words.length + 1];
        dfs(begin, target, 0);

        if(!success) {
            cnt = 0;
        }

        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(solution("hit", "cog", new String[] { "hot", "dot", "dog", "lot", "log", "cog" }));
        success = false;
        System.out.println(solution("hit", "cog", new String[] { "hot", "dot", "dog", "lot", "log" }));
    }

}
