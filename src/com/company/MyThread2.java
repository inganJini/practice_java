package com.company;

// Runnable 인터페이스를 구현하는 방법
public class MyThread2 implements Runnable{
    String str;
    public MyThread2 (String str){
        this.str = str;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(str);

            try {
                Thread.sleep((int)Math.random()*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
