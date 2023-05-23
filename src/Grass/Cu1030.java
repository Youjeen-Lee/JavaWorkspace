package Grass;

import java.util.Scanner;

public class Cu1030 { // 코드업 기초예제 1030 정수 입력받아 그대로 출력
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long l = scn.nextLong();
        System.out.println(l);

    }
}
// int 범위: -2147483648 ~ +2147483647
// long 범위: -9223372036854775808 ~ +9223372036854775807
// long보다 더 큰 수는 BigInteger (실수는 BigDemical)