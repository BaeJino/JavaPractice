package org.dimigo.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGeneraChart {
    public static void main(String[] args) {
        List<Music> list = new ArrayList<>();
        list.add(new Music("사랑에 연습이 있었다면","임재현"));
        list.add(new Music("주저하는 연인들을 위해","잔나비"));

        List<Music> list2 = new ArrayList<>();
        list2.add(new Music("작은 것들을 위한 시","방탄소년단"));

        Map<String, List<Music>> map = new HashMap<>();

        map.put("발라드",list);
        map.put("댄스",list2);

        System.out.println("<< 멜론 장르별 챠트 >>");
        printMap(map);

        System.out.println("<< 댄스 1위 곡 변경 >>");
        list2.set(0,new Music("AH YEAH","WINNER"));
        printMap(map);

        System.out.println("<< 발라드 1위 곡 삭제 >>");
        list.remove(0);
        printMap(map);

        System.out.println("<< 전체 데이터 삭제 >>");
        list.clear();
        list2.clear();

    }

    //map.keyset() 키 목록
    //map.get(key) 키를 입력값으로 넣고 , value를 가져온다
    //map.get(key)는 한마디로 value값인 Arraylist인 셈이다.
    //map.get(발라드).size() = list.size();

    public static void printMap(Map<String,List<Music>> map) {

        //키목록에서 키를 하나씩 받아옴 현재 키는 발라드와 댄스
        for (String key : map.keySet()) {
            System.out.println("[" + key + "]");
            for(int i = 1; i<= map.get(key).size() ; i++){
                System.out.print(i +". ");
                System.out.println(map.get(key).get(i-1).getTitle() +
                        " ("+map.get(key).get(i-1).getSinger()+")");
            }
        }
        System.out.println();
    }
}
