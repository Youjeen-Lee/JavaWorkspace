package polyclass;

import java.util.Scanner;

public class Ex08_03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] aa = new int[4];
        int hap = 0, i; // ==> int hap = 0 && int = i

        for (i = 0; i <= 3; i++) {
            System.out.printf("%d번째 숫자를 입력하세요 : ", i + 1);
            aa[i] = s.nextInt();

            hap = hap + aa[i]; // ==> i값이 3일때까지 반복문을 돌리면 i=0일때 hap은 '0+1번째 입력값', i=1일 때 hap은 '이전의 0+1번째 입력값 + 2번째 입력값 ... '
                               //     4번을 각각 더하는게 아니라 hap에 값이 계속 쌓이는 것.

        }
        System.out.printf(" 합계 ==> %d \n", hap);  // ==> i < 4이므로 반복문이 끝나면 그동안 값이 축적된 hap을 출력
    }
}