package Grass;

import java.util.Scanner;

public class Cu1063 {
    public static void main(String[] args) { // 두 정수 입력받아 큰 수 출력하기 (삼항연산자 사용)
        int a;
        int b;

        Scanner scn = new Scanner(System.in);
        a = scn.nextInt();
        b = scn.nextInt();

        System.out.print(a>b?a:b);
    }
}
