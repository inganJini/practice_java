/*
 입력된 수가 소수(PrimeNumber)인지 판별하시오

 13

 정답 : 13은 소수 입니다.

 */

package jins._7;

public class Main {

    public static void main(String[] args) {
        int num = 110;
        // 소수 1, 자기자신을 제외하고 나누어 떨어지는 약수가 있으면 -> 소수가아님.
        // 소수 : 1과 자기자신으로 나누어 떨어지는 수

        boolean isPrimeNumber = true;

        for (int i = 2; i < num; i++){
            if (num % i == 0){
                isPrimeNumber = false;
            }
        }

        if (isPrimeNumber){
            System.out.println(num + "은 소수입니다.");
        } else {
            System.out.println(num + "은 소수가 아닙니다.");
        }

    }

}
