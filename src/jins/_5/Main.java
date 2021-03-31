/*
 대문자는 소문자로, 소문자는 대문자로 변환하시오

 helloWorlD

 정답 : HELLOwORLd

 */

package jins._5;

public class Main {

    public static void main(String[] args) {

        String str =  "helloWorlD";

        char [] arr;
        arr = str.toCharArray();

        System.out.println(str);
        //System.out.println('A'-'a');
        //System.out.println((char)('a'+32));


        for (int i = 0; i < arr.length; i++){
            //str.substring(i, i+1).;
            if (arr[i] >= 'a' && arr[i] <= 'z'){
                arr[i] = (char) (arr[i] + ('A'-'a'));
            }
            else if (arr[i] >= 'A' && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i] - ('A'-'a'));
            }
        }

        System.out.println(arr);

    }
}
