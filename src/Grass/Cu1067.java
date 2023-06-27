package Grass;

import java.util.Scanner;

public class Cu1067 { // 코드업 기초예제 1067 : 정수 1개 입력받아 음/양/홀/짝 구분하기.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();

        if (num > 0) {

            System.out.println("plus");

            if ((num % 2) == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }

        if (num < 0) {

            System.out.println("minus");

            if ((num % 2) == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }

        }

    }
}