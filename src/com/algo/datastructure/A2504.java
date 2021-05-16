package com.algo.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class A2504 {

    static int invalid = 0;

    public static void calculate(Stack<Object> stack, int weight, char target) {
        Object pop;
        int tot = 0;

        do {
            pop = !stack.isEmpty() ? stack.pop() : false;

            if (pop instanceof Integer) {
                tot += (Integer) pop;
            } else if(pop instanceof Character && (char) pop == target) {
                --invalid;
                stack.push(tot * weight);
                break;
            }
        } while (!stack.isEmpty());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = reader.readLine().toCharArray();
        Stack<Object> stack = new Stack<>();
        int total = 0;

        for(int i = 0; i < arr.length; i++) {

            if (arr[i] == '(' || arr[i] == '[') {
                stack.push(arr[i]); ++invalid;
                continue;
            } else if(!stack.isEmpty() && (arr[i] == ')' || arr[i] == ']')){
                if((arr[i] == ')' && arr[i-1] == '[') || (arr[i] == ']' && arr[i-1] == '(')) {
                    System.out.println("0");
                    return;
                }

                if(arr[i] == ')') {
                    if(arr[i - 1] == '(') {
                        stack.pop(); --invalid;
                        stack.push(2);
                    } else {
                        calculate(stack, 2, '(');
                    }
                } else if(arr[i] == ']') {
                    if(arr[i - 1] == '[') {
                        stack.pop(); --invalid;
                        stack.push(3);
                    } else {
                        calculate(stack, 3, '[');
                    }
                }
            } else {
                System.out.println("0");
                return;
            }
        }

        while(!stack.isEmpty()) {
            Object o = stack.pop();

            if(o instanceof Integer) {
                total += (int) o;
            } else {
                ++invalid;
            }

        }

        if(invalid != 0) {
            System.out.println("0");
            return;
        }

        System.out.println(total);
    }

}
