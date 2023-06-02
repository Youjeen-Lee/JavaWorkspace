package Grass;

import java.util.Scanner;

public class Cu1042 { // 코드업 기초예제 1042번 정수 2개 입력받아 나눈값 출력
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // 2개의 정수가 공백으로 구분되어 입력
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(a/b);
    }
}
