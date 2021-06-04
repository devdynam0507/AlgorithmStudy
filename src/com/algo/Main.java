package com.algo;

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

    public static void main(String[] args) {
        objects = new Object[] { "강낭", "성남", "화성", "수원", "에잇" };
        objects = addAll(2, "군산", "전주", "대구");
        printAll(objects);
    }
}

