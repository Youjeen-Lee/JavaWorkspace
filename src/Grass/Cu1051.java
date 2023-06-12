package Grass;

import java.util.Scanner;

public class Cu1051 { // 코드업 기초예제 1051
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        if (a <= b) {
            System.out.println(1);
        } else if (a > b) {
            System.out.println(0);
        }

    }
}

