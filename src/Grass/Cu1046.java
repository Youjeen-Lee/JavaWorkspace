package Grass;

import java.util.Scanner;

public class Cu1046 { // 코드업 기초예제 1046 정수 3개 입력받아 합과 평균 출력
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        float avg = (float)((a+b+c)/3.0); // or '3f'
        System.out.println(a+b+c);
        System.out.printf("%.1f\n", avg);

    }
}
/* 11행 : a+b+c/3 라고 썼더니 c/3부터 연산이 되어서 값이 달라짐. 묶어줄것!!
   11행 : `(a+b+c)/3`에서 `3`이 정수형 상수이기 때문에 정수형으로 계산됨. 실수형으로 계산하려면
          `3.0`, '3f'와 같이 소수점을 붙이거나 f를 붙여 실수형으로 만들어 주면 됨! */

