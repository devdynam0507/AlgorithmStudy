package com.algo;

public class 알고리즘2 {

    public static final String INT = "INT";
    public static final String BOOL = "BOOL";
    public static final String SHORT = "SHORT";
    public static final String LONG = "LONG";
    public static final String FLOAT = "FLOAT";

    static int memory = 0;
    static StringBuilder sb = new StringBuilder();
    static boolean error = false;

    public static void fill(final int memorySize, final int weight) {
        if(memory + memorySize > 128) {
            error = true;
            return;
        }

        if(memory <= 0) {
            for(int i = 0; i < memorySize; i++) {
                sb.append("#");
                memory += 1;
                if (memory % 8 == 0) {
                    sb.append(",");
                }
            }
        }
        else {
            while(memorySize > 1 && memory % weight != 0) {
                sb.append(".");
                memory += 1;

                if(memory % 8 == 0) {
                    sb.append(",");
                }
            }

            for(int i = 0; i < memorySize; i++) {
                sb.append("#");
                memory += 1;

                if(memory % 8 == 0) {
                    sb.append(",");
                }
            }
        }
    }

    public static void solution(String[] param) {
        for(String mem : param) {
            switch (mem) {
                case BOOL:
                    fill(1, 1);
                    break;
                case SHORT:
                    fill(2, 2);
                    break;
                case FLOAT:
                    fill(4, 4);
                    break;
                case INT:
                    fill(8, 8);
                    break;
                case LONG:
                    fill(16, 8);
                    break;
            }

            if(error) {
                System.out.println("HALT");
                return;
            }
        }

        while(memory % 8 != 0) {
            sb.append(".");
            memory += 1;
        }

        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }


        System.out.println(sb);
        sb.setLength(0);
        memory = 0;
        error = false;
    }

    public static void main(String[] args) {
        solution(new String[] {
                "INT",
                "INT",
                "BOOL",
                "SHORT",
                "LONG",
        });
        solution(new String[] {
                "INT",
                "SHORT",
                "FLOAT",
                "INT",
                "BOOL",
        });
        solution(new String[] {
                "FLOAT",
                "SHORT",
                "BOOL",
                "BOOL",
                "BOOL",
                "INT",
        });
        solution(new String[] {
                "INT",
                "BOOL"
        });
        solution(new String[] {
                "BOOL",
                "LONG",
                "SHORT",
                "LONG",
                "BOOL",
                "LONG",
                "BOOL",
                "LONG",
                "SHORT",
                "LONG",
                "LONG",
        });
    }

}
