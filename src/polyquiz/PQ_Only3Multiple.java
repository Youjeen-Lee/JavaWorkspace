package polyquiz;
import java.util.Scanner;
public class PQ_Only3Multiple {
    public static void main(String[] args) { // 3의 배수일때만 출력하기

        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("3의 배수를 쓰세요. -> ");
        a = s.nextInt();

        if(a % 3 == 0) {
            System.out.printf("3의 배수입니다.\n");

        }
        else {
            System.out.printf("정답이 아닙니다.\n");
        }
    }
}
