package com.company;

import java.util.ArrayList;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("kang");
        list.add("kim");

        // LIST는 같은 값 중복 가능
        System.out.println(list.size());

        for(int i = 0; i < list.size(); i++){
            String str = list.get(i);
            System.out.println(str);
        }

    }
}
