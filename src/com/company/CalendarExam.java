package com.company;

import java.util.Calendar;

public class CalendarExam {
    public static void main(String[] args) {
        // Calendar 는 버전업이되면서 다른 값을 return해줄 수 있기 때문에
        // new 로 생성하지 않고 getInstance() 로 가져온다
        Calendar cal = Calendar.getInstance();

        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH)+1);  // 월은 +1 해야함
    }
}
