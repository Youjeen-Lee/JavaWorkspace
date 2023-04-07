package Grass;
import java.util.Scanner;

public class BJ1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 정수 개수와 상관없이 스캐너는 한번만 선언
        int a, b = 0; // 값을 받기위해 초기화하는거 아닌가? 왜 초기화가 불필요하다고 해??
        a = sc.nextInt(); // int a, b = sc.nextInt(); 안되는 이유는?
        b = sc.nextInt();

        System.out.printf("%d \n",a+b);
    }
}
