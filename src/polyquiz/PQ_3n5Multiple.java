package polyquiz;
import java.util.Scanner;

public class PQ_3n5Multiple { // 자바 퀴즈 복습
    public static void main(String[] args) { // 3과 5의 배수 판별(연산자)

        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("값을 입력하세요 ->");
        a = s.nextInt();

        if((a % 3 == 0) && (a % 5 == 0)) {
            System.out.printf("3의 배수와 5의 배수를 모두 만족합니다.\n");
        } else if(a % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else if( a % 5 == 0) {
            System.out.print("5의 배수입니다.");
        }
    }
}
// 조건문 ()뒤에 ';' 쓰지않게 주의!! ==> 문장이 끝나버려서 조건문이 실행이 안돼 출력문이 무조건 출력됨.