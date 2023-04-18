package polyquiz;

import java.util.Arrays; //Arrays 클래스는 항목 정렬, 항목 검색, 항목 비교와 같은 메소드들을 제공ㄴ
import java.util.Scanner;

public class PolyQuiz0419 { // 배열을 이용하여 정수를 오름차순으로 정렬, 자바의 정석 p.415 참고!
    public static void main(String[] args) {
        // Scanner 객체를 생성한다.
        Scanner sc = new Scanner(System.in);

        // 크기가 5인 int형 배열 num을 선언하고 생성
        int[] num = new int[5];
        System.out.println("정수 5개를 입력하세요. : ");

        // 5개의 정수를 입력받아서 배열 num에 저장
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        // 배열 num을 오름차순으로 정리한다.
        Arrays.sort(num);
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
            // for 루프를 사용하여 num 배열의 요소를 큰 순서대로 출력한다.
            // num[4], num[3], num[2], num[1], num[0]
            // 출력할 숫자 사이에 공백을 추가하기 위해 + " "
        }
        sc.close();
        // Scanner 객체를 닫는다
        // ==> 없어도 실행은 되지만 자원을 해제하지않으면 1) 메모리 누수 2)시스템 성능 저하 가능성이 높아짐
    }
}
