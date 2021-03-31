/*
 10진수를 2진수로 변환하시오

 19

 정답 : 10011

 */

package jins._4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);

        int inputNum = 19;
        int bin[] = new int[100];

        /**
         * 19 / 2    9 ... 1
         * 9  / 2    4 ... 1
         * 4  / 2    2 ... 0
         * 2  / 2    1 ... 0
         * 1  / 2    0 ... 1
         *
         *  010011 => 19
         */

        int i = 0;
        int result = inputNum;

        while (result > 0) {
            bin[i] = result % 2;
            result /= 2;
            i++;
        }

        i--;
        for (; i>=0; i--) {
            System.out.print(bin[i]);
        }
        //System.out.println();
        //for (; i>=0; i--) {
        //    System.out.print(i);
        //}

    }
}
