package com.company.lambdaEx;

public class lambdaExam1 {
    // 예제에는 클래스 이름이 Car
    // 이름, 탑승인원, 가격 사용년수를 필드로 가진다.
    public String name;
    public int capacity;
    public int price;
    public int age;

    // 각각의 필드를 생성자에서 받아서 초기화합니다.
    public lambdaExam1 (String name, int capacity, int price, int age) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
        this.age = age;
    }

    // lambdaExam1 객체를 문자열로 출력하면 이름을 출력한다.
    public String toString() {
        return this.name;
    }

    public static void main(String[] args) {
        lambdaExam1 car = new lambdaExam1("new model", 4, 3000, 0);
        System.out.println(car.toString());
    }
}
