package Grass;

import java.util.Scanner;

public class Cu1045 { // // 코드업 기초예제 1045
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        float A = a;
        System.out.printf("%.2f\n", A/b); // %2f 아님 주의!!

    }
}
