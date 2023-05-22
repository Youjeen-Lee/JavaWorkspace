package Grass;

import java.util.Scanner;

public class Cu1029 { // 코드업 기초예제 100제 실수 그대로 출력
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double d = scn.nextDouble();
        System.out.printf("%.11f",d);

    }
}
// float은 소수점 7자리, double은 소수점 14자리까지 나타낼수있음.