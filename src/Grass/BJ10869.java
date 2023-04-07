package Grass;
import java.util.Scanner;
public class BJ10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b = 0;
        // 8행의 int a, b = 0; 초기화를 안해주면 코드 에러가 나오는데
        // 왜 a, b를 0으로 초기화하는게 불필요하다고 나오지?
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.printf("%d \n", a+b);
        System.out.printf("%d \n", a-b);
        System.out.printf("%d \n", a*b);
        System.out.printf("%d \n", a/b);
        System.out.printf("%d \n", a%b);
    }
}
