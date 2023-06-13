package Grass;

import java.util.Scanner;

public class Cu1055 { // 코드업 기초예제 1055 : 하나라도 참이면 참 출력하기
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        if ((a==1)||(b==1)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
