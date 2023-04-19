package polyquiz;

import java.util.Scanner;

public class PQ_ElseIf { //A와 B의 대소관계를 if와 else if로
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A, B;
        System.out.println("A의 값을 입력하세요 : ");
        A = s.nextInt();

        System.out.println("B의 값을 입력하세요 : ");
        B = s.nextInt();

        if (-10000 <= A && B <= 10000) {
            if (A > B) {
                System.out.printf(">");
            } else if (A < B) {
                System.out.printf("<");
            } else if (A == B) {
                System.out.printf("==");
            }

        }
    }
}
