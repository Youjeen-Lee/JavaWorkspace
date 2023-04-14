package Grass;

import java.util.Scanner;
public class Cu1018 { // 기초 예제 100제
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            System.out.printf("%s", s);
    }
}

// charAt을 썼는데도 에러가 나는 이유 : 입력예시가 공백없이 주어졌으므로 ('3:16' )
// ==> 문자열 전체를 받는 nextLine 을 써야함
// 문자열 전체를 받으므로 변수는 하나만 있어도 됨
