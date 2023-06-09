package Grass;

import java.util.Scanner;

public class Cu1048 { // 코드업 기초예제 1048 비트시프트연산 : 한 번에 2의 거듭제곱 배로 출력하기
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        System.out.printf("%d\n", a<<b);
//        System.out.println(a<<b);
    }
}
