package polyclass;

import java.util.Scanner;

public class Ex08_02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[ ] aa = new int[4]; // int aa를 메모리에 올려라, 4칸 모양을 메모리에 만들어라
        int hap;

        for (int i = 0; i <4; i++) {
            System.out.println(i + 1 + "번째 숫자를 넣으세요 : ");
            aa[i] = s.nextInt();
        }
        hap = aa[0] + aa[1] + aa[2] + aa[3]; // 무조건 0부터 시작

        System.out.printf(" 합계 ==> %d \n", hap);

    }
}
