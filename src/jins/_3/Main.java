/*
 최빈수 구하기
 가장 많이 출현한 수를 출력하시오.

 1 2 2 3 1 4 2 2 4 3 5 3 2

 정답 : 2 (5회)
*/
package jins._3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] inputNum = new int[10];
        for (int i = 0; i < 10; i++){
            inputNum[i] = sc.nextInt();
        }

        // 1 2 2 3 1 4 2 2 4 3 5 3 2

        // 1: 2
        // 2: 4
        // 3: 2
        // 4: 2

        // index -> 출현한 수
        // index 값 -> index(출현한수)가 몇번 나왔는지 저장하는 용도

        // "mode[3] = 5, => 3번 숫자가 5번 입력됐다"

        int [] mode = new int[10];

        for (int i = 0; i < 10; i++){
            mode[inputNum[i]]++;
        }

        int modeNum = 0; // 최빈수
        int modeCnt = 0; // 최빈수가 나온 횟수

        for (int i = 0; i < 10; i++){
            if (modeCnt < mode[i]){
                modeCnt = mode[i];
                modeNum = i;
            }
        }
        System.out.println("최빈수는 "+ modeNum + "이고 횟수는 " + modeCnt + "회 입니다. ");

    }
}
