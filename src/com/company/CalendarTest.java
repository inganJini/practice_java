package com.company;

import java.util.Calendar;

public class CalendarTest {
    public String hundredDaysAfter() {
        //오늘부터 100일 뒤의 날짜를 "2016년1월1일"의 형식으로 return하세요.
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 100);

        int yyyy = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int date = cal.get(Calendar.DATE);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);

        //String str = yyyy+"년"+month+"월"+date+"일";
        StringBuffer sb = new StringBuffer();

        String str = sb.append(Integer.toString(yyyy)).append("년")
                       .append(Integer.toString(month)).append("월")
                       .append(Integer.toString(date)).append("일")
                       .toString();

        return str;
    }

    public static void main(String[] args) {
        CalendarTest calex = new CalendarTest();
        String ans = calex.hundredDaysAfter();
        System.out.println(ans);
    }
}
