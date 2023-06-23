package Grass;

import java.util.Scanner; //

public class Cu1064 { // 1064 : 정수 3개 입력받아 가장 작은 수 출력하기
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        System.out.println(((a<b)?a:b)<c?((a<b)?a:b):c);

    }
}
// (a > b)? a : b