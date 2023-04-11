package Grass;

import java.util.Scanner;

public class Cu1011 { // 코드업 기초예제 100
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = 0;
        c = sc.nextLine().charAt(0);
        // c = sc.next().charAt(0); ==> 가능
        // Scanner로는 문자열만 입력받을 수 있기 때문에 스트링 참조변수 뒤에 CharAt()을 붙여야한다. ()는 인덱스번호로 ()번째의 글자만 char로 바꾸겠다는 뜻이다.
        // nextByte, nextShort, nextInt, nextLong, nextFloat, nextDouble, nextBoolean 모두 가능 wow~~
        // next와 nextline의 차이 :전자는 공백을 기준으로 한 단어 또는 한 문자씩 받고 후자는 문장 라인 전체를 입력받음.

        System.out.printf("%c", c);
        // System.out.print(c); ==> 가능
        // System.out.print('c'); ==> 입력값과 상관없이 알파벳 문자 'c'가 출력

    }
}
