package com.algo.twopointer;

import java.util.*;

public class Inflearn302 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr1len = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[arr1len];
        StringTokenizer tokenizer1 = new StringTokenizer(scanner.nextLine());
        int arr2len = Integer.parseInt(scanner.nextLine());
        int[] arr2 = new int[arr2len];
        StringTokenizer tokenizer2 = new StringTokenizer(scanner.nextLine());
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(tokenizer1.nextToken());
        }
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(tokenizer2.nextToken());
        }
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int p1 = 0;
        int p2 = 0;
        while(p1 < arr1.length && p2 < arr2.length) {
            if(arr1[p1] == arr2[p2]) {
                list.add(arr1[p1]);
                p1 ++;
                p2 ++;
                continue;
            }
            if(arr1[p1] < arr2[p2]) {
                p1 ++;
            }
            else if(arr1[p1] > arr2[p2]) {
                p2 ++;
            }
        }
        list.forEach(i -> System.out.print(i + " "));
    }

}
