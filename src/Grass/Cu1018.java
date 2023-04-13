package Grass;

import java.util.Scanner;
public class Cu1018 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int h = sc.nextInt();
            char c = sc.next().charAt(0);
            int m = sc.nextInt();

            System.out.printf("%d %c %d", h, c, m);

    }
}

 // 에러난 이유 : 입력예시가 3:16이면 ':'도 내가 입력해야함!
// ==> 그래도 에러나네 ...뭐꼬ㅡㅡ