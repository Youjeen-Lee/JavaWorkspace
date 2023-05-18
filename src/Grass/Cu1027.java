package Grass;

import java.util.Scanner;

public class Cu1027 { // 코드업 기초 예제 날짜 입력받아 다른 형식으로 출력.
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String date = scn.nextLine();
        String[] dateAry = date.split("\\."); // 온점은 정규표현식에서 특수문자로 인식되므로 \\를 앞에 써줘야함.

        String y = String.valueOf(Integer.parseInt(dateAry[0]));
        String m = String.valueOf(Integer.parseInt(dateAry[1]));
        String d = String.valueOf(Integer.parseInt(dateAry[2]));

        System.out.println(String.format("%s-%s-%s",dateAry[2] ,dateAry[1],dateAry[0] ));
        // 다른 풀이  System.out.printf("%02d-%02d-%04d \n", Integer.parseInt(d), Integer.parseInt(m), Integer.parseInt(y));
    }
}

// Q. System.out.println(String.format("%2s-%2s-%4s",d,m,y)); or ("%s-%s-%s",d,m,y)
//    이렇게 쓰면 날짜에서 '0'이 생략되고 7-5-2014 이렇게 나오는데 값이 달라지는 이유는?