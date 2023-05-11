package Grass;

import java.util.Scanner;

public class Cu1025 { // 다섯자리의 정수 1개 입력받아 자리별로 나누어 출력하기
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String[] ary = scn.nextLine().split("");
        // 따로 스트링 선언 안해주고 배열에 바로 입력받은스 값을 스플릿으로 쪼개어 저장할 수 있다.

        System.out.println("["+Integer.parseInt(ary[0]) * 10000+"]");
        System.out.println("["+Integer.parseInt(ary[1]) * 1000+"]");
        System.out.println("["+Integer.parseInt(ary[2]) * 100+"]");
        System.out.println("["+Integer.parseInt(ary[3]) * 10+"]");
        System.out.println("["+Integer.parseInt(ary[4]) * 1+"]");
        // 출력문에서 정수형으로 변환할 수 있음

        scn.close();

        }
    }

