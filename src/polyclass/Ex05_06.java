package polyclass;
import java.util.Scanner;
public class Ex05_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // 내가 만든 클래스, 자바 파일을 메모리에 올리고 싶으면 명령어 'new'
        int a;                              // System.in -> sout의 반대, 입력한다

        System.out.printf("정수를 입력하세요 : ");
        a = s.nextInt(); // -> 얜 뭐지?

        if(a % 2 == 0) {
            System.out.printf("짝수를 입력했군요..\n");
        } else {
            System.out.printf("홀수를 입력했군요..\n");
        }


    }
}
 // 함수 : int 처럼 변수를 넣어 값을 내는것 / 명령어 : 요구하는것 ex) psvm, if, sout 등
