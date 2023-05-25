package Grass;

import java.util.Scanner;


public class Cu1036 { // 코드업 기초예제 1036 영문자 입력받아 10진수로 출력
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char eng = scn.nextLine().charAt(0); // charAt 쓸 때는 반드시 인덱스번호(가져올 문자의 위치) 써야함
        int decimal = (int) eng; // 강제 형변환
        System.out.println(decimal);
    }
}

// 영문자를 바로 정수로 변환할 수 없는 이유 ;
// 문자열을 정수로 변환할 때는 해당 문자열이 반드시 정수형태여야함.
// 따라서 영문자를 정수로 변환하려면 유니코드 값을 구한 후 정수형으변환해야 가능하다.


