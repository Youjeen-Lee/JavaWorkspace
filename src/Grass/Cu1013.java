package Grass;

import java.util.Scanner;

public class Cu1013 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d %d", a, b);
    }
}
// int a, b = sc.nextInt 가 안되는 이유 : 공백(엔터)를 기준으로 위에서 아래로 입력값을 받기때문.
// ex) 입력 : 1(공백)2 ==> a가 1만받고, 공백없이 12치면 12로 인식해서 a = 12가 됨.
