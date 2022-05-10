package com.algo.strings;

import java.util.Scanner;

public class Inflearn109 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().replaceAll("[a-zA-Z]", "");
        System.out.println(Integer.parseInt(str));
    }

}
