package com.algo.graphtraversal;

public class P타겟넘버 {

    static int cnt = 0;

    public static void dfs(int[] numbers, int target, int x, int sum) {
        if(x == numbers.length) {
            if(sum == target) {
                cnt += 1;
            }
            return;
        }

        dfs(numbers, target, x + 1, sum + numbers[x]);
        dfs(numbers, target, x + 1, sum - numbers[x]);
    }

    public static int solution(int[] numbers, int target) {
        int answer = 0;

        dfs(numbers, target, 0, 0);
        System.out.println(cnt);
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1,1,1,1,1}, 3);
    }
}
