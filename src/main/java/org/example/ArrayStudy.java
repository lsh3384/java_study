package org.example;

public class ArrayStudy {
    public void printArrayWithForIteration() {
        int[] intArray1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // 선언을하고 이후에 생성하는 경우에는 new int[]를 붙여줘야 함
        int[] intArray2;
        intArray2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("intArray1");
        for (int i = 0; i < intArray1.length; i++) {
            System.out.println(intArray1[i]);
        }

        System.out.println("intArray2");
        for (int i = 0; i < intArray2.length; i++) {
            System.out.println(intArray2[i]);
        }
    }

    public void copyArrayWithForIteration() {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        System.out.println("[변경전]");
        System.out.println("arr.length: " + arr.length);
        for (int i = 0; i < arr.length; i++)
            System.out.println("arr[" + i + "]:" + arr[i]);

        int[] tmp = new int[arr.length*2];

        // 배열 arr에 저장된 값들을 배열 tmp에 복사한다.
        for(int i =0; i < arr.length; i++)
            tmp[i] = arr[i];

        arr = tmp;

        System.out.println("[변경후]");
        System.out.println("arr.length:" + arr.length);
        for(int i = 0; i < arr.length; i++)
            System.out.println("arr["+i+"]:" + arr[i]);

    }
}
