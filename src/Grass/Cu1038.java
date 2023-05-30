package Grass;

import java.util.Scanner;

public class Cu1038 { // 코드업 기초예제 1038 : 정수 2개 입력받아 합 출력하기
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // 2개의 정수가 공백으로 구분되어 입력
        long a = scn.nextLong();
        long b = scn.nextLong(); // 입력값이 123 -123일 때, long b가 선언되지 않았다면 출력값은 123
        System.out.println(a+b);

    }
}

// Scanner 메소드의 원리 :
// 스페이스바(공백)를 기준으로 새로운 값을 받겠다는 의미임
// 공백을 기준으로 순서대로 입력값이 변수에 저장됨. 모든 타입의 변수형에 사용가능(ex: long a, String b로 선언했다면 정수 123, 문자열 '-123'으로 저장됨)
// 단 nextLine()은 한줄로 입력받으므로 불가(split 사용해야함)