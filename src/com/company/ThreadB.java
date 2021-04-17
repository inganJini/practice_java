package com.company;

public class ThreadB extends Thread{
    int total;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(i+"를 더합니다.");
                total += i;

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            notify(); // ThreadB 실행 다하고 notify해줘야 ThreadA의 Main스레드가 동작
        }
    }
}
