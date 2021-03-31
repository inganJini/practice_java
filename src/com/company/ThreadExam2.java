package com.company;

public class ThreadExam2 {

    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("*");
        MyThread2 t2 = new MyThread2("-");

        // start 를 호출해야 스레드 쓰는데
        // Runnable 구현한 객체라 start 사용못함

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();

        System.out.println("main End  !!!");
    }

}
