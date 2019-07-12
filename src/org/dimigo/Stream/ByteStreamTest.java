package org.dimigo.Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamTest {
    public static void main(String[] args) {
        copyFile();
    }


    private static void copyFile() {
        try (InputStream is = new FileInputStream("data/od.jpg");
             OutputStream os = new FileOutputStream("data/od2.jpg")) {

            long start = System.currentTimeMillis();

            int result;

            byte[] buf = new byte[1024];

            while((result = is.read(buf)) != -1){
                os.write(buf,0,result);
                //코드들이 어떤 역할을 하는지
            }

            long end = System.currentTimeMillis();

            System.out.println("파일 생성 완료 : " + (end - start));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
