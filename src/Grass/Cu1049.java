package Grass;

import java.util.Scanner;

public class Cu1049 { // 코드업 기초예제 1049 두 정수 입력받아 비교하기
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        if (a > b) {
            System.out.println(1);
        } else { // else if (a <= b) 로도 가능!
            System.out.println(0);
        }
    }
}

