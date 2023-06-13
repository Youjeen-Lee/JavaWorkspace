package Grass;

import java.util.Scanner;

public class Cu1054 { // 코드업 기초예제 1054 : 둘 다 참일 경우만 참 출력하기
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        if ((a == 1) && (b == 1)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

// 11행에서  (a && b==1) 이렇게는 불가능! 우선 (1) &&는 2개의 boolean 연산자를 필요로 하고, (2) 이렇게 하면 정수 'a'와 boolean 'b==1'로 나눠짐.