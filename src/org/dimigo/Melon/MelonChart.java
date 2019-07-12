package org.dimigo.Melon;

import java.util.ArrayList;
import java.util.List;

public class MelonChart {
    public static void main(String[] args) {
        List<Music> list = new ArrayList<>();
        list.add(new Music("사랑에 연습이 있었다면", "임재현"));
        list.add(new Music("주저하는 연인들을 위해", "잔나비"));

        System.out.println("<<멜론 챠트 >>");
        printList(list);

        System.out.println("<< 2위 곡 추가 >>");
        list.add(1, new Music("작은 것들을 위한 시", "방탄소년단"));
        printList(list);

        System.out.println("<<3위 곡 변경 >>");
        list.set(2, new Music("AH YEAH", "WINNER"));
        printList(list);

        System.out.println("<<2위 곡 삭제 >>");
        list.remove(1);
        printList(list);

        System.out.println("<< 전체 리스트 삭제 >>");
        list.clear();
        printList(list);


    }


    public static void printList(List<Music> list) {
        int cnt = 1;
        for (Music value : list) {
            System.out.println(cnt++ + ". " + value.getTitle() + "  (" + value.getSinger() + ")");
        }
        System.out.println();

    }
}
