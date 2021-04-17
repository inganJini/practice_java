package com.company;

public class ThreadA {
    public static void main(String[] args) {
        ThreadB thread = new ThreadB();
        thread.start();

        synchronized (thread) {
            try {
                System.out.println("thread가 완료될 때 까지 기다립니다.");
                thread.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Total is : " + thread.total);
        }
    }
}
