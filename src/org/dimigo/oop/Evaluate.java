package org.dimigo.oop;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Evaluate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        int num = 0;
        String[] questions = {"가장 좋아하는 가수는?","가장 좋아하는 배우는?","가장 좋아하는 과목은?"};
        String[] answers = {"아이유","변유진","육송희"};

        do{
            System.out.println("--------------");
            System.out.println("1. 질문 선택");
            System.out.println("2. 정답 공개");
            System.out.println("9. 프로그램 종료");
            System.out.println("--------------");
            System.out.print("메뉴 입력 => ");
            menu = scanner.nextInt();
                switch (menu){
                    case 1:
                        num = new Random().nextInt(3);
                        System.out.println(questions[num]);
                        Scanner scanner1 = new Scanner(System.in);
                        String answer = scanner1.next();
                        if(answer.equals(answers[num]) == true){
                            System.out.println("정답입니다!");
                        }
                        else
                            System.out.println("틀렸습니다!");
                        break;

                    case 2:
                        StringBuilder sb = new StringBuilder();
                        for(int i = 0;i<=2;i++){
                            sb.append(questions[i] + " " + answers[i] +"\n");
                        }
                        System.out.println(sb);
                        break;

                    case 9:
                        System.out.println("Bye~");
                        break;

                    default:
                        System.out.println("없는 메뉴입니다.");



            }
        }while(menu != 9);



    }
}
