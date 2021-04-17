package com.company;

public class MusicBox {
    public synchronized void playMusicA () {  // synchronized : 모니터링 락 기능 메서드 점유함
        for (int i = 0; i < 10; i++){
            System.out.println("신나는 음악 !!!");

            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void playMusicB () {
        for (int i = 0; i < 10; i++){
            System.out.println("감성 음악 !!!");

            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void playMusicC () {
        for (int i = 0; i < 10; i++){
            synchronized (this){
                System.out.println("카페 음악 !!!");
            }

            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
