package org.dimigo.oop;

public class ArrayBasic {
    public static void main(String[] args) {
        //자바의 배열은 객체이고 모든 데이터 타입의 배열을 만들 수 있다.
        //기본형 타입 배열
        //int , long , boolean , char , float , double , short, byte

        int[] intArr2 = {1, 2, 3, 4, 5};
        printArray(intArr2);

        //double 타입 5개짜리 배열 생성 후 출력
        double[] douArr = new double[5];
        printArray(douArr);

        String[] strArr = new String[3];
        printArray(strArr);

        strArr[0] = "치킨";
        strArr[1] = "족발";
        strArr[2] = "짜장면";
        printArray(strArr);

        String[] strArr2 = new String[]{"트와이스", "블랙핑크", "씨잼"};
        printArray(strArr2);


        //Book 타입 배열 2개짜리 생성
        Book[] bookArr = new Book[2];

        printArray(bookArr);

        Book[] bookArr2 = {
                new Book("수학의바이블","김재영",100),
                new Book("뉴북뉴북딱딱","뉴딱북",100)
        };
        printArray(bookArr2);

        //배열 사용시 주의 사항!!
        int[] intArr3 = new int[3];
        System.out.println(intArr3.length);
        System.out.println(intArr3[3]); //범위 초과

        String[] strArr3 = new String[3];
        System.out.println(strArr3[0]);
        System.out.println(strArr3[0].length()); //null 상태에서 길이 못 구함.


        Book[] bookArr3 = new Book[3];
        System.out.println(bookArr3[0]);
        System.out.println(bookArr3[0].getTitle()); //nul 상태인데 타이틀 못구함
    }

    private static void printArray(Book[] bookArr) {
        for(Book value : bookArr){
            System.out.println(value);
        }
        System.out.println();
    }
    private static void printArray(int[] intArr) {
        //intArr 배열요소값 출력
        //for(int i = 0;i<intArr.length;i++)
        //  System.out.println(intArr[i]);
        for(int value : intArr){
            System.out.print(value + " | ");
        }
        System.out.println();
    }

    private static void printArray(String[] strArr) {
        //intArr 배열요소값 출력
        //for(int i = 0;i<intArr.length;i++)
        //  System.out.println(intArr[i]);
        for(String value : strArr){
            System.out.print(value + " | ");
        }
        System.out.println();
    }

    private static void printArray(double[] douArr) {
        //intArr 배열요소값 출력
        //for(int i = 0;i<intArr.length;i++)
        //  System.out.println(intArr[i]);
        for(double value : douArr){
            System.out.print(value + " | ");
        }
        System.out.println();
    }
}
