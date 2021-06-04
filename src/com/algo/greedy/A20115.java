package com.algo.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class A20115 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        PriorityQueue<Double> energyDrinks = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < T; i++) { energyDrinks.add(Double.parseDouble(tokenizer.nextToken())); }

        while (energyDrinks.size() > 1) {
            double x1 = energyDrinks.poll();
            double x2 = energyDrinks.poll();

            energyDrinks.add(x1 + (x2 / 2));
        }

        System.out.println(new DecimalFormat("#.##############").format(energyDrinks.poll()));
    }

}
