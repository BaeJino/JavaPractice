package org.dimigo.Stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class CharStreamTest {
    public static void main(String[] args) {
        copyFile();

    }

    private static void copyFile() {
        try(Reader reader = new FileReader("data/123.txt");
            Writer writer = new FileWriter("data/output.txt")){

            long start = System.currentTimeMillis();

            int result;

            char[] buf = new char[1024];

            while((result = reader.read(buf)) != -1){
                writer.write(buf,0,result);
            }

            writer.write("추가 출력 메세지");

            long end = System.currentTimeMillis();

            System.out.println("파일 생성 완료 : " + (end-start));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
