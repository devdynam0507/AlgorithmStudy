package com.algo.strings;

import java.util.Scanner;

public class Inflearn105 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] word = scanner.nextLine().toCharArray();
        char[] result = new char[word.length];

        for(int i = 0; i < word.length; i++) {
            if((word[i] >= 65 && word[i] <= 90) || (word[i] >= 97 && word[i] <= 122)) {
                result[word.length - 1 - i] = word[i];
            }
            else {
                result[i] = word[i];
            }
        }

        System.out.println(new String(result));
    }

}
