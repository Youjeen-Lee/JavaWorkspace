package polyquiz;

import java.util.Scanner;

public class PQ_2n3Multiple { // 2와 3의 배수 또는 최소공배수인지 판별
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Q. 2의 배수와 3의 배수 또는 둘 다 만족하는 수를 입력하세요.");

        int a;
        a = sc.nextInt();

        if (a % 2 == 0 && a % 3 == 0) {
            System.out.println("2와 3의 배수를 만족합니다. ");
        } else if(a % 2 == 0) {
            System.out.println("2의 배수를 만족합니다. ");
        }

     else if(a % 3 == 0) {
            System.out.println("3의 배수를 만족합니다. ");
        }
     else {
            System.out.println("A. 정답이 아닙니다. ");
        }
    }
}
