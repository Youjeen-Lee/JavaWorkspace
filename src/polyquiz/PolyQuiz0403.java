package polyquiz;
import java.util.Scanner;
public class PolyQuiz0403 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A, B = 0;
        A = s.nextInt();
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
