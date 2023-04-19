package polyquiz;

import java.util.Scanner;
public class PQ_5Multiple { // 5의 배수 판별(연산자)
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("5의 배수를 입력하세요. : ");
        a = s.nextInt();

        if(a % 5 == 0) {
            System.out.printf("5의 배수입니다.\n");
        }
        else {
            System.out.printf("정답이 아닙니다.\n");
        }
    }
}
