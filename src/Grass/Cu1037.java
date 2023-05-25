package Grass;

import java.util.Scanner;

public class Cu1037 { // 코드업 기초예제 1037 : 10진 정수 입력받아 아스키 문자로 출력
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int deci = scn.nextInt();
        char c = (char) deci;
        System.out.println(c);
    }
}
