package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {

        // 변수란? 하나의 값을 저장하기 위한 메모리 공간
        // ex) int = 정수형 변수, char = 문자형, double = 실수형 -> 저장할 값과 일치하는 타입으로 변수를 선언.

        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2);  // 6
        System.out.println(4 - 2);  // 2
        System.out.println(4 * 2);  // 8
        System.out.println(4 / 2);  // 2
        System.out.println(5 / 2);  // 2.5가 아니라 소수점 버려지고 2만 나옴
        System.out.println(2 / 4);  // 0.5가 아니라 0만 남음
        System.out.println(4 % 2);  // %는 나머지 연산, 4를 2로 나눴을 때의 나머지 = 0
        System.out.println(5 % 2);  // 1

        // 우선 순위 연산
        System.out.println(2 + 2 * 2);  // 6
        System.out.println((2 + 2) * 2);  // 8
        System.out.println(2 + (2 * 2));  // 6


        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a % b;
        System.out.println(c);  // 0

        // 증감 연산  ++, --

        int val;

        val = 10; // v01
        System.out.println(val); // 10
        System.out.println(++val); // 11
        System.out.println(val); // 11

        val = 10; // v02
        System.out.println(val); // 10
        System.out.println(val++); // 10
        System.out.println(val); // 11

        // v01이랑 v02의 차이에 주의

        // Github 뿌셔뿌셔?







    }

    }

