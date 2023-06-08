package Grass;

import java.util.Scanner;

public class Cu1047 { // 정수 1개 입력받아 2배 곱해 출력하기(비트시프트 연산자)
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i = scn.nextInt();
        System.out.printf("%d\n", i<<1 ); // i>>1 하면 나누기 2
    }
}

/* 예시
        int a=10;
        printf("%d", a<<1); //10을 2배 한 값인 20 이 출력된다.
        printf("%d", a>>1); //10을 반으로 나눈 값인 5 가 출력된다.
        printf("%d", a<<2); //10을 4배 한 값인 40 이 출력된다.
        printf("%d", a>>2); //10을 반으로 나눈 후 다시 반으로 나눈 값인 2 가 출력된다. */
