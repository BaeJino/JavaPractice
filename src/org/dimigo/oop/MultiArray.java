package org.dimigo.oop;

public class MultiArray {
    public static void main(String[] args) {
        int[][] intArr = new int[2][3];

        printArray(intArr);

        intArr[0][2] = 100;
        intArr[1][1] = 100;

        //String 타입 이차원 배열
        //C C++ JAVA
        //C# PHP
        String[][] strArr = {

                {"C","C++","JAVA"},
                {"C#","PHP"}
        };
//        strArr[0][0] = "C";
//        strArr[0][1] = "C++";
//        strArr[0][2] = "JAVA";
//        strArr[1][0] = "C#";
//        strArr[1][1] = "PHP";

        printArray(strArr);
    }

    private static void printArray(String[][] strArr) {
        for (String[] arr : strArr) {
            for (String value : arr) {
                System.out.print(value + "|");
            }
            System.out.println();
        }
    }

    private static void printArray(int[][] intArr) {
//        for(int i = 0 ; i < intArr.length ; i++){
//            for(int j=0;j< intArr[i].length;j++){
//                intArr[i][j] = 0;
//                System.out.println(intArr[i][j]);
//            }
//        }
//    }

        for (int[] arr : intArr) {
            for (int value : arr) {
                System.out.println(value + "|");
            }
        }
    }
}
