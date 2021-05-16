package com.algo.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A1935 {

    private static final char MULT = '*';
    private static final char DEVI = '/';
    private static final char PLUS = '+';
    private static final char MINUS = '-';

    private static boolean isOperator(char operator) {
        return operator == MULT || operator == DEVI || operator == PLUS || operator == MINUS;
    }

    private static double calculate(double left, double right, char operator) {
        switch (operator) {
            case MULT:
                return left * right;
            case DEVI:
                return left / right;
            case PLUS:
                return left + right;
            case MINUS:
                return left - right;
        }

        return 0.0f;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countOfOperand = Integer.parseInt(reader.readLine()); // 피연산자를 받을 카운트
        char[] expression = reader.readLine().toCharArray(); // 식을 char배열로 분리함
        Map<Character, Double> operandMap = new HashMap<>();
        Queue<Double> operandQueue = new LinkedList<>();
        Stack<Double> calculator = new Stack<>();

        for(int i = 0; i < countOfOperand; i++) {
            operandQueue.add(Double.parseDouble(reader.readLine()));
        }

        for(char ch : expression) {
            if(isOperator(ch)) {
                double a = calculator.pop();
                double b = calculator.pop();

                calculator.push(calculate(b, a, ch));
            } else {
                Double n = operandMap.get(ch);
                if(n == null) {
                    operandMap.put(ch, operandQueue.poll());
                }

                calculator.push(operandMap.get(ch));
            }
        }

        System.out.println(String.format("%.2f", calculator.pop()));
    }

}
