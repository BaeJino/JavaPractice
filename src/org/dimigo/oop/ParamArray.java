package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5, 6};
        add(intArr, 10);
        printArray(intArr);

        String[] names = {"홍길동", "홍길서", "홍길남", "홍길북"};
        changeName(names, "김");
        printArray(names);
    }
    private static void changeName(String[] names, String A) {
        for(int i =0 ; i < names.length;i++){
            names[i] = names[i].replace("홍", A);
        }

    }

    private static void printArray(String[] names) {
        for(int i =0 ; i<names.length;i++)
        {
            System.out.println(names[i]);
        }
    }
    private static void printArray(int[] intArr) {
        for(int i =0 ; i<intArr.length;i++)
        {
            System.out.println(intArr[i]);
        }
    }

    private static void add(int[] intArr, int i) {
        for(int j = 0 ; j< intArr.length ; j++){
            intArr[j] += 10;
        }
    }
}
