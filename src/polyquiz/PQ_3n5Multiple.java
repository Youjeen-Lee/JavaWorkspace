package polyquiz;
import java.util.Scanner;

public class PQ_3n5Multiple {
    public static void main(String[] args) { // 3과 5의 배수 판별(연산자)

        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("값을 입력하세요 ->");
        a = s.nextInt();

        if(a % 3 == 0) {
            System.out.printf("3의 배수입니다.\n");
        } else if(a % 5 ==0) {
            System.out.printf("5의 배수입니다.\n");
        } else if(a % 3 == 0 && a % 5 == 0); {
            System.out.printf("3의 배수와 5의 배수를 모두 만족합니다.");
        }

    }
}
