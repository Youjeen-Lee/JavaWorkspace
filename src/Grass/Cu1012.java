package Grass;

import java.util.Scanner;

public class Cu1012 { //코드업 기초 100제
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float f = sc.nextFloat();
        System.out.printf("%f", f); // ==> printf 사용하면 실수형으로 소수점 이하 6번째짜리까지 ex) 1.540000
        // System.out.print(f) ==> 실수가 아니라 내가 입력한 값이 그대로 출력 ex) 1.54
        // System.out.print(f) ==> 정수 입력하면? 소수점 첫번째짜리까지 나옴 ex) 1 -> 1.0
    }
}