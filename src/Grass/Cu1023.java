package Grass;

import java.util.Scanner;

public class Cu1023 { // 실수 1개 입력받아 부분별로 출력하기
    public static void main(String[] args) { // 실수 1개 입력받아 부분별로 출력하기

        Scanner scn = new Scanner(System.in);
        String num = scn.nextLine();
        String[] numArr = num.split("\\.");

        String i = numArr[0];
        String f = numArr[1];
// 풀이 (1)
        int a = Integer.parseInt(i);
        int b = Integer.parseInt(f); // 실수 부분이지만 소수점 이하를 절삭하여 출력하기위해 int로 선언.

        System.out.println(a);
        System.out.print(b);

//// 풀이 (2)
//        int a = Integer.parseInt(i);
//        double b = Integer.parseInt(f);
//
//        System.out.println(a);
//        System.out.print((int)f); // 소수점 이하를 절삭하기위해 int로 형변환. (float은 왜 안되나?)


    }
}



// Q. 풀이 (2)
//    문제에서 조건이 소수점 이하 자릿수는 최대 6자리까지이므로 실수 부분에 float을 사용하라는 것 같은데
//    float은 double처럼 소수점 이하 자르기가 없는건가? 검색해도 double에 관한 것만 나온다.

// parseInt : String 문자열로 된 숫자를 Int 등의  숫자타입으로 변환해줌(단, 문자열이 무조건 숫자로만 이루어져있어야함)
// Byte.parseByte(); short.ParseShort(); Long.parseLong(); Float.parseFloat(); 등등
