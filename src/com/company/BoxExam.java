package com.company;

public class BoxExam {
    public static void main(String[] args) {
//        Box box = new Box();
//        box.setObj(new Object());
//        Object get_obj = box.getObj();
//
//        box.setObj("Hello");
//        String str = (String)box.getObj();
//        System.out.println(str);
//
//        box.setObj(1);
//        int value = (int)box.getObj();

        Box<Object> box = new Box<>();
        box.setObj(new Object());
        Object get_obj = box.getObj();

        Box<String> box2 = new Box<>();
        box2.setObj("Hello");
        String str = box2.getObj();

        Box<Integer> box3 = new Box<>();
        box3.setObj(10);
        int get_int = box3.getObj();

    }
}
