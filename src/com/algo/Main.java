package com.algo;

import java.util.*;

public class Main {

    public static Object[] objects;

    public static Object[] copyArrayShiftResize(int shift, int start, Object... newObjects) throws ArrayIndexOutOfBoundsException {
        Object[] copied = new Object[objects.length + shift];
        if(start > objects.length) {
            throw new ArrayIndexOutOfBoundsException("start 값은 src 크기보다 작아야해요.");
        }

        System.arraycopy(objects, 0, copied, 0, start); // 시작 이전 배열 복사
        // 공간 할당 이후 배열 복사
        System.arraycopy(objects, start, copied, start + shift, objects.length - start);
        // 넣으려는 인덱스 위치부터 넣으려는 배열의 원소를 복사
        System.arraycopy(newObjects, 0, copied, start, newObjects.length);

        return copied;
    }

    public static Object[] addAll(int index, Object... newObjects) {
        return copyArrayShiftResize(newObjects.length, index, newObjects);
    }

    private static void printAll(Object... objects) {
        for(Object obj : objects) { System.out.println(obj); }
    }

    private static void _syncRepositoryDelete(Object[] objects1, Object[] objects2, List<Object> sync) {
        for(Object repository : objects1) {
            boolean isExists = false;

            for(Object newly : objects2) {
                if(newly.equals(repository)) {
                    isExists = true;
                }
            }

            if(!isExists) {
                sync.add(repository);
            }
        }
    }

    private static void _syncRepositoryAdd(Object[] newlyRepositories,
                                    Object[] repositories,
                                    List<Object> sync) {
        for(Object newly : newlyRepositories) {
            boolean isExists = false;

            for(Object repository : repositories) {
                if(repository.equals(newly)) {
                    isExists = true;
                    sync.add(repository);
                    break;
                }
            }

            if(!isExists) {
                sync.add(newly);
            }
        }
    }

    /**
     * String min-heap을 이용한 O(N) sync 메소드
     * @param objects1 기존 배열
     * @param objects2 새로운 배열
     * */
    private static List<Object> syncArray(LinkedList<String> objects1, LinkedList<String> objects2) {
        List<Object> result = new ArrayList<>();
        List<Object> deleted = new ArrayList<>();
        int olderSize = objects1.size();
        int newlySize = objects2.size();

        long start = System.currentTimeMillis();
        while(!objects1.isEmpty()) {
            Object obj1 = objects1.peek();
            Object obj2 = objects2.peek();

            if(obj1.equals(obj2)) {
                objects1.poll();
                objects2.poll();
                result.add(obj1);
            }
            else {
                if (newlySize > olderSize) {
                    result.add(objects2.poll());
                }
                else {
                    deleted.add(objects1.poll());
                }
            }
        }
        System.out.println("algorithm power ==> :" + (System.currentTimeMillis() - start + "ms"));

        return result;
    }

    static class Hello {

        public void call() {
            print();
        }

        public void print() {
            print();
            System.out.println("hello");
        }

    }

    static class World extends Hello {
        public void call() {
            super.print();
        }

        public void print() {
            System.out.println("world");
        }
    }

    public static void main(String[] args) {
        Hello obj = new World();
        obj.call();
//        LinkedList<String> a = new LinkedList<>();
//        LinkedList<String> b = new LinkedList<>();
//
//        for(int i = 0; i < 100000; i++) {
//            a.add(i + 1 + "");
//        }
//        for(int i = 0; i < 100001; i++) {
//            b.add(i + 1 + "");
//        }
//        Collections.sort(a);
//        Collections.sort(b);
//
//        syncArray(a, b);
    }
}

