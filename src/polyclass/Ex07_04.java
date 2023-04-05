package polyclass;

import java.io.IOException; // 타자치지 말고 alt + enter
import java.util.Scanner;

public class Ex07_04 {
    public static void main(String[] args) throws IOException {   // 에러를 IOExeption으로 던져라
                                                                  // 제발 철자좀..오타좀..제발....
                                                                  // 다른 사람한테 물어보기전에 영어 철자, 구두점 등 오타 검수부터
        Scanner s = new Scanner(System.in);
        int a, b;
        char ch;

    while(true) {
        System.out.printf("계산할 첫번째 수를 입력 : ");
        a = s.nextInt();
        System.out.printf("계산할 두번째 수를 입력 : ");
        b = s.nextInt();
        System.out.println("계산할 연산자를 입력하세요 : ");
        ch = (char) System.in.read();

        switch (ch) { // 조건이 5개 넘으면 switch case 문을 써라
            case '+':
                System.out.printf("%d + %d = %d 입니다. \n", a, b, a+b); break;
            case '-':
                System.out.printf("%d + %d = %d 입니다. \n", a, b, a-b); break;
            case '*':
                System.out.printf("%d + %d = %d 입니다. \n", a, b, a*b); break;
            case '/':
                System.out.printf("%d + %d = %d 입니다. \n", a, b, a/b); break;
            case '%':
                System.out.printf("%d + %d = %d 입니다. \n", a, b, a&b); break;
            default:
                System.out.printf("연산자를 잘못 입력했습니다. \n");

                  }
             }
         }
    }

