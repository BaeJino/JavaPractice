package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("사과");
        list.add("배");
        list.add("딸기");
        list.add("딸기");

        printList(list);

    }


    public static void printList(List<String> list){
        for(String value : list)
        {
            System.out.println(value + "//");
        }
        System.out.println();
    }
}
