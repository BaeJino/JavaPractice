package org.dimigo.oop;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        String[] src = {"서울","의왕","시흥","부산"};
        //배열 출력

        System.out.println(Arrays.toString(src));
        //Arrays.toString() 배열안의 자료를 출력해줌.

        //배열 복사
        String[] destination = Arrays.copyOf(src,src.length);

        System.out.println(src == destination);
        System.out.println(Arrays.equals(src,destination));

        Arrays.sort(destination);
        System.out.println(Arrays.toString(destination));

        //배열 검색 ( 정렬을 먼저 해야함 )
        System.out.println(Arrays.binarySearch(destination,"시흥"));

    }
}
