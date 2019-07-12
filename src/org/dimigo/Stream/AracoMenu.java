package org.dimigo.Stream;

import java.io.*;

public class AracoMenu {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader
                (new InputStreamReader(System.in));
            FileWriter writer = new FileWriter("data/아라코메뉴")){

            String data;

            while((data = br.readLine()) != null){
                writer.write(data + "\n");
            }



        }catch (Exception e){
            e.printStackTrace();
        }

        try(FileReader reader = new FileReader("data/아라코메뉴")){

            int result;
            char[] buf = new char[1024];

            //reader.read로 한문자씩 읽어오면 시간이 걸리기때문에 buf배열 생성
            //buf에 입력? 해서 result에 넣어줌
            //A : buf 배열에 담아서 내용을 전달해주세요
            //그럼 buf에 내용이 저장되고 그걸 읽어서 result에 int형식으로 저장된다

            while((result = reader.read(buf)) != -1){
                System.out.println(buf);
            }
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
