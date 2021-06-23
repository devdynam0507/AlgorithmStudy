package com.algo.graphtraversal;

import java.util.*;

public class P여행경로 {

    static boolean[] visit;
    static List<String> result;

    static List<String> getTickets(String[][] tickets, String departureName) {
        List<String> list = new ArrayList<>();

        for(int i = 0; i < tickets.length; i++) {
            if(visit[i]) {
                continue;
            }

            if(tickets[i][0].equals(departureName)) {
                list.add(tickets[i][1]);
            }
        }

        Collections.sort(list);
        return list;
    }

    static boolean isExists(String[][] tickets, String departureName) {
        for(int i = 0; i < tickets.length; i++) {
            if(tickets[i][0].equals(departureName)) {
                return true;
            }
        }
        return false;
    }

    static boolean isAllVisit(String[][] tickets, String departure) {
        for(int i = 0; i < tickets.length; i++) {
            if(tickets[i][0].equals(departure) && !visit[i]) {
                return false;
            }
        }

        return true;
    }

    static int fx(String[][] tickets, String departure, String arrive) {
        for(int i = 0; i < tickets.length; i++) {
            if(!visit[i] && tickets[i][0].equals(departure) && tickets[i][1].equals(arrive)) {
                return i;
            }
        }

        return -1;
    }

    static void dfs(String[][] tickets, int x) {
        // 같은 이름의 출발 티켓을 모두 ArrayList에 담고 sort
        // 먼저 맨앞에 있는 원소를 dfs한다 (체크하는거 필요함)
        // 만약 맨앞에 있는 원소의 출발지점이 없다면 다음 원소를 dfs한다.
        if(x == -1) { return; }
        if(visit[x]) { return; }

        visit[x] = true;
        String[] arr = tickets[x];
        result.add(arr[0]);
        System.out.println("adding" + arr[0] + " " + arr[1]);
        //System.out.println(result);

        if(result.size() + 1 == tickets.length + 1) {
            result.add(arr[1]);
            return;
        }

        List<String> ticketList = getTickets(tickets, arr[1]);
//        if(tickets.length + 1 - result.size() == 2) {
//            System.out.println("run");
//            result.add(arr[1]);
//            result.add(ticketList.get(0));
//            return;
//        }

        for(String s : ticketList) {
            if(isAllVisit(tickets, s) && tickets.length + 1 - result.size() != 2) {
                System.out.println("is all! " + s);
                continue;
            }
            dfs(tickets, fx(tickets, arr[1], s));
        }
    }

    public static String[] solution(String[][] tickets) {
        visit = new boolean[tickets.length];
        result = new ArrayList<>();
        List<String> list = getTickets(tickets, "ICN");
        // ICN 시작점
        for(String s : list) {
            int fx = fx(tickets, "ICN", s);
            if(!isExists(tickets, s) || fx == -1) {
                continue;
            }

            dfs(tickets, fx(tickets, "ICN", s));
        }


        String[] arr = new String[result.size()];
        arr = result.toArray(arr);
        System.out.println(result);
        return arr;
    }
    public static void main(String[] args) {
        //solution(new String[][] { {"ICN", "A"}, {"ICN", "B"}, {"B", "ICN"}});
        //solution(new String[][] { {"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}});
        //solution(new String[][] { {"ICN","A"},{"A","B"},{"B","A"},{"A","ICN"},{"ICN","A"}});
        //solution(new String[][] { {"ICN","A"},{"ICN","A"},{"A","ICN"} });
//        String[][] strings = new String[][] {
//                {"ICN", "BOO"},
//                {"ICN", "COO"},
//                {"COO", "DOO"},
//                {"DOO", "COO"},
//                {"BOO", "DOO"},
//                {"DOO", "BOO"},
//                {"BOO", "ICN"},
//                {"COO", "BOO"},
//        };
//        solution(strings);
        solution(new String[][]{
                {"ICN", "B"},
                {"B", "ICN"},
                {"ICN", "A"},
                {"A", "D"},
                {"D", "A"},
        });
    }
}
