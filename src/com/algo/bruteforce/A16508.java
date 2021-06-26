package com.algo.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class A16508 {

    static String target;
    static boolean[][] visited;
    static int result;

    static String[] books;
    static int[] prices;

    public static void perm(int bookIndex, String str) {
        if(!str.isEmpty()) {
            System.out.println(str);
        }
        String book = books[bookIndex];
        // 자기 자신으로 만들 수 있는지 검증
        for(int i = 0; i < book.length(); i++) {
            if(visited[bookIndex][i]) {
                continue;
            }

            visited[bookIndex][i] = true;
            perm(bookIndex, str + book.charAt(i));
            visited[bookIndex][i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        target = reader.readLine();
        int N = Integer.parseInt(reader.readLine());
        visited = new boolean[16][50];
        result = Integer.MIN_VALUE;
        prices = new int[N];
        books = new String[N];

        for(int i = 0; i < N; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int price = Integer.parseInt(tokenizer.nextToken());
            books[i] = tokenizer.nextToken();
            prices[i] = price;
        }

        for(int i = 0; i < N; i++) {
            perm(i, "");
        }
    }

}
