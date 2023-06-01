package Grass;

import java.util.Scanner;

public class Cu1041 { // 코드업 기초예제 1041 : 문자 1개 입력받아 다음 문자 출력하기
    public static void main(String[] args) {
        // 풀이 (1)
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        System.out.println((char)(ch+1));

        /* 풀이 (2)
           char ch = scn.next().charAt(0);
           ch++;
           System.out.println(ch); */
    }
        }


        /* Q. 9행 출력문에서 (ch+1)만 쓰면 아스키코드값이 출력되는 이유는?
           A. 문자 변수와 숫자를 더할 때, 자바는 이를 아스키 코드 값으로 계산한다. 이유는 자바에서는 문자를 내부적으로 아스키 코드 값으로 처리하기 때문 */

        /* 자바 출력문에서 큰 따옴표 없이 연산하면?
           (1) 숫자끼리 연산 : 계산된 값 출력 ex) (1+2) ==> 3
           (2) 문자끼리 연산 : 각 문자의 아스키 코드값을 더한 값이 출력 ex) ('a'+'b') ==> 195
           (3) 숫자와 문자 : (2)와 마찬가지 ex) (1+'b') ==> 99
         */

