package com.company;

public class LambdaExam {

    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 10; i++){
//                    System.out.println("hello");
//                }
//            }
//        }).start();
        // 람다식으로 표현 (익명 메소드)
        new Thread(() -> {
            for (int i = 0; i < 10; i++){
                System.out.println("hello");
            }
        }).start();
    }

}
