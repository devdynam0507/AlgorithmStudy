package com.algo.graphtraversal;

public class P타겟넘버 {

    public static boolean[] minus;
    public static boolean[] visit;
    static int cnt = 0;
    static int sum = 0;
    static int cntOfMinus = 0; // 음수 카운트

    public static void dfs(int[] numbers, int x, int target) {
        if(x == numbers.length + 1) {
            return;
        }

        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            int number = minus[i] ? -numbers[i] : numbers[i];
            sum += number;
        }

        if(sum > target) {
            cntOfMinus += 1;
            minus[x] = true;
            dfs(numbers, x, target);
        }
        else if(sum == target) {
            //음수 카운트를 어떻게 옮겨 갈건지 고민해보면 될듯 ㅎㅎ
            dfs(numbers, x + 1, target);
        }
    }

    public static int solution(int[] numbers, int target) {
        int answer = 0;
        visit = new boolean[numbers.length + 1];
        minus = new boolean[numbers.length + 1];

        dfs(numbers, 0, target);
        System.out.println(cnt);
        return answer;
    }

    public static void main(String[] args) {
        solution(new int[]{1,1,1,1,1}, 3);
    }
}
