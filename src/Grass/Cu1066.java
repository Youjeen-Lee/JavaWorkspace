package Grass;

import java.util.Scanner;

public class Cu1066 { // 코드업 기초예제 1066번
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if((a%2) == 0)
            System.out.println("even");
        else
            System.out.println("odd");
        if((b%2) == 0)
            System.out.println("even");
        else
            System.out.println("odd");
        if((c%2) == 0)
            System.out.println("even");
        else
            System.out.println("odd");

    }
}

//오류(1) : else에 조건을 줌
//오류(2) : else if를 'elseif'라고 띄워쓰기 없이 씀
//오류(3) : if 조건문을 짝수로 줬으면 어차피 그 외에 수는 홀수이므로 else if를 쓸 이유가 없다.
