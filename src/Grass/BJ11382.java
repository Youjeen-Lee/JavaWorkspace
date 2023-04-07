package Grass;
import java.util.Scanner;
public class BJ11382 { // 꼬마정민아...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //    long a, b, c  = 0; // 10의 12승까지 받을 수 있는 변수를 써야함
        long a = sc.nextLong(); //next도 Long으로 받아야함(대문자!!)
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = a + b + c;

        System.out.printf("%d \n", d);
    }
}
