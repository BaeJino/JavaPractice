package org.dimigo.collection;

import java.util.HashMap;
import java.util.Map;


public class HashMapTest {
    public static void main(String[] args) {


        HashMap <String,Integer> map = new HashMap<>();
        //Key와 Value 따로 저장됨.
        //Generic 도 다르게 설정해야 함

        map.put("kor",100); // Key , Value
        map.put("mat",92);
        map.put("eng",95);

        //map.keyset() map의 key 목록을 출력
        System.out.println(map.keySet());
        printMap(map);

        map.remove("eng");
        printMap(map);


    }


    public static void printMap(Map<String,Integer> map){
        for(String key : map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }
        System.out.println();

    }
}
