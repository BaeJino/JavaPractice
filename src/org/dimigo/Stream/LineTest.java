package org.dimigo.Stream;

import java.io.*;

public class LineTest {
    public static void main(String[] args) {

        //버퍼 리더가 보조 스트림 (2차) , 기반스트림(1차)에는 없는 한줄씩
        //읽어오기 기능을 추가해줌
        //버퍼 리더 객체 생성 , 버퍼리더에는 InputStreamReader를 넣어줌줌
       try(BufferedReader br = new BufferedReader
                (new InputStreamReader(System.in))){

           String data;
           //컨트롤 + D 를 누르면 null 이 출력됨 (입력 종료)
           while((data = br.readLine()) != null) {
               System.out.println("출력 => " + data);
           }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}