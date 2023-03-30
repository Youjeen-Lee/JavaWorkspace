package polyquiz;

import java.util.Scanner;
public class PolyQuiz_403 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("5의 배수를 입력하세요. -> ");
        a = s.nextInt();

        if(a % 5 == 0) {
            System.out.printf("5의 배수입니다.\n");
        }
        else {
            System.out.printf("정답이 아닙니다.\n");
        }
    }
}
