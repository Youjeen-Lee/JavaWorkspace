package polyquiz;
import java.util.Scanner;

public class PQ_3Multiple { // 3의 배수 구하기(연산자)
    public static void main(String[] args) {

        // 사용자 입력 받기
        System.out.printf("30보다 크고 100보다 작은 3의 배수를 입력하세요. : ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        // 입력된 수가 30 ~ 100 사이에 있고, 3의 배수인지 검사
        if ((a > 30) && (a < 100)) {
            if (a % 3 == 0) {
                System.out.println("정답입니다!\n");
            } else {
                System.out.printf("3의 배수가 아닙니다.\n");
            }
        } else {
            System.out.printf("30보다 크고 100보다 작은 수를 입력하세요.\n");
        }
    }
}

