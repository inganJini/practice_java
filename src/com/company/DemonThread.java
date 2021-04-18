package com.company;

// Runnable 을 구현하는 DaemonThread 클래스를 작성
public class DemonThread implements Runnable{

    // 무한루프안에서 0.5초씩 쉬면서 데몬쓰레드가 실행중입니다를 출력하도록 run() 메소드를 작성
    @Override
    public void run() {
        while(true) {
            System.out.println("데몬 쓰레드가 실행중입니다.");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break; // Exception 발생시 while 문 빠지도록
            }
        }
    }

    public static void main(String[] args) {
        // Runnable을 구현하는 DemonThread를 실행하기 위한 Thread 객체 생성
        Thread thread = new Thread(new DemonThread());
        // 데몬쓰레드로 설정
        thread.setDaemon(true);
        // 쓰레드를 실행
        thread.start();

        // 메인 쓰레드가 1초 뒤에 종료되도록 설정.
        // 데몬쓰레드는 다른 쓰레드가 모두 종료되면 자동 종료
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("메인 쓰레드가 종료됩니다.");
    }
}
