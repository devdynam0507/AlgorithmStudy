package com.algo.graphtraversal;

import java.util.LinkedList;
import java.util.Queue;

public class P단어변환 {

    static String[] wwords;
    static boolean[] visit;
    static boolean success = false;

    static class G {
        public String string;
        public int dept;
    }

    static boolean same(String a, String b) {
        int diff = 0;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) {
                ++diff;
            }
        }

        return diff == 1;
    }

    static int bfs(G g, String target) {
        Queue<G> queue = new LinkedList<>();
        queue.add(g);

        int depth = 0;
        while(!queue.isEmpty()) {
            G poll = queue.poll();
            depth = poll.dept;

            if(poll.string.equals(target)) {
                success = true;
                break;
            }

            for(int i = 0; i < wwords.length; i++) {
                String v = wwords[i];

                if(visit[i]) {
                    continue;
                }

                if(same(poll.string, v)) {
                    System.out.println(poll.string + " " + v);
                    G n = new G();
                    n.string = v;
                    n.dept = depth + 1;
                    visit[i] = true;

                    queue.add(n);
                }
            }
        }

        return depth;
    }

    static int solution(String begin, String target, String[] words) {
        int answer = 0;
        wwords = words;
        visit = new boolean[words.length + 1];

        G f = new G();
        f.string = begin;
        f.dept = 0;

        int cnt = bfs(f, target);
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
