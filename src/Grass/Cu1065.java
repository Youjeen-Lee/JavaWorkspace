package Grass;

import java.util.Scanner;

public class Cu1065 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if(a%2==0)
            System.out.println(a);
        if(b%2==0)
            System.out.println(b);
        if(c%2==0)
            System.out.println(c);

    }
}
 // if문 쓸 때 else문 필요없으면 적지 않아도 실행됨