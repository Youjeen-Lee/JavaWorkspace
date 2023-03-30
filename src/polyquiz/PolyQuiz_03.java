package polyquiz;

import java.util.Scanner;

public class PolyQuiz_03 {
    public static void main(String[] args) {

        for (int a = 1; a > 100; a++) {

            Scanner s = new Scanner(System.in);
            a = s.nextInt();

            System.out.printf(" 30보다 크고 100보다 작은 3의 배수를 입력하세요 --> ");

            if ((a > 30) && (a < 100)) {

                if (a % 3 == 0) {
                    System.out.println("정답입니다! :)\n");

                } else {

                    System.out.printf("3의 배수가 아닙니다. :(\n");
                }
            }
        }
    }
}



    // scanner 두번쓰지 않고 for로 반복할 수 있을까?
