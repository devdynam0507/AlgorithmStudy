package com.algo.strings;
import java.util.Scanner;

public class Infleran101 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char[] line = in.nextLine().toCharArray();
        char ch = in.nextLine().toCharArray()[0];
        int cnt = 0;

        for(int i = 0; i < line.length; i++) {
            if(line[i] == ch || line[i] + 32 == ch || line[i] - 32 == ch) {
                ++cnt;
            }
        }

        System.out.println(cnt);
    }

}
