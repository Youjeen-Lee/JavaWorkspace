package Grass;

import java.util.Scanner;

public class Cu1035 { // 코드업 기초예제 1035 16진수로 입력받아 8진수로 변환
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String data = scn.nextLine();

        //먼저 문자열로 입력받고

        int dataInt = Integer.valueOf(data, 16);

        //문자열을 16진수로 변환


        System.out.printf("%o",dataInt);

        //16진수를 8진수로 출력

        scn.close();
    }
}
