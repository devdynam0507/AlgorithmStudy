package com.algo.datastructure;

import java.io.*;
import java.util.*;

public class A1966 {

    public static class Document {

        public int priority;
        public int index;

        public Document(int priority, int index) {
            this.priority = priority;
            this.index = index;
        }
    }

    public static int service(LinkedList<Document> documents, PriorityQueue<Integer> priorities, int pick) {
        int size;
        int result = 0;

        while(!documents.isEmpty()) {
            Document document = documents.get(0);
            size = documents.size();

            for(int i = 0; i < size; i++) {
                if(document.priority < documents.get(i).priority) {
                    documents.remove(0);
                    documents.addLast(document);
                    break;
                }
            }

            document = documents.get(0);
            if(priorities.peek() == document.priority) {
                ++result;
                priorities.poll(); documents.removeFirst();

                if(document.index == pick) {
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter con = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(reader.readLine());

        for(int i = 0; i < T; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            StringTokenizer arrTokenizer = new StringTokenizer(reader.readLine());
            int amountOfDocs = Integer.parseInt(tokenizer.nextToken());
            int pick = Integer.parseInt(tokenizer.nextToken());
            LinkedList<Document> documentDeque = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

            for(int j = 0; j < amountOfDocs; j++) {
                int a = Integer.parseInt(arrTokenizer.nextToken());

                priorityQueue.add(a);
                documentDeque.addLast(new Document(a, j));
            }

            con.write(service(documentDeque, priorityQueue, pick) + "\n");
        }

        con.flush();
    }

}
