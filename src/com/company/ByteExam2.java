package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("src/com/company/ByteExam1.java");
            fos = new FileOutputStream("byte.txt");

            int readCount = -1;
            byte[] buffer = new byte[512];  // .read()로 byte 단위로 호출해도 OS 자체적으로 512씩 불러오게 설정 되어있음
                                            // 그래서 배열크기를 미리 512로 선언하고 사용하면 속도 개선
            while ((readCount = fis.read(buffer)) != -1){
                //fos.write(readData);
                fos.write(buffer,0,readCount);
            }

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
