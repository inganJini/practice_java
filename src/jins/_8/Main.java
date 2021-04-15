/*
 입력된 수의 팩토리얼을 구하시오

 5

 정답 : 120

 */

package jins._8;

public class Main {

    static int result = 0;

    public static int factorial(int n) {
        return n * (n+1);
    }

    public static void main(String[] args) {
        int num = 5;
        //int result = 0;

        for (int i = 1; i <= num; i++){
            //result = factorial(i);
            result = i * (i+1);
        }


        System.out.println(result);

    }

}
