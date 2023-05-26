package Grass;

import java.util.Scanner;

public class Gugudan_method {
    public static void gugu(int i) {
        for (int j = 1; j < 10; j++) {
            System.out.printf("%2d X %d = %2d\n", i, j, i * j);
        }
    }

    public static void main(String[] args) {

        System.out.print("출력하고 싶은 단을 입력 :");
        Scanner scn = new Scanner(System.in);
        int dan = scn.nextInt();

        gugu(dan);

    }

}

