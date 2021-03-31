package com.company;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class ByteExam4 {
    public static void main(String[] args) {
        try (
                DataInputStream in = new DataInputStream(new FileInputStream(("data.txt")));
                ){
            int i = in.readInt();
            boolean b = in.readBoolean();
            double c = in.readDouble();


            System.out.println(1);
            System.out.println(b);
            System.out.println(c);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
