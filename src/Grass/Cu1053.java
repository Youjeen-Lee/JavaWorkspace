package Grass;

import java.util.Scanner;

public class Cu1053 { // 코드업 기초예제 1053 : 참 거짓 바꾸기
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        System.out.println(num == 0 ? 1 : 0); // 삼항연산자 : num이 0이면 1, 0이 아니면 0을 출력
        // System.out.println(num != 0 ? 0 : 1); // 이렇게해도 같은 결과
    }
}

/* C 코드  :
#include <stdio.h>

int main() {
	int num;
	scanf("%d", &num);
	printf("%d", !num);
	return 0;
}
 */
