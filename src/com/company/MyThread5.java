package com.company;

public class MyThread5 extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Mythread5 " + i);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
