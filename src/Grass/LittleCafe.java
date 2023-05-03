package Grass;

import java.util.Scanner;

public class LittleCafe { // 여러명의 주문을 받도록 하기.
    public static int coffee_machine(int button) {
        System.out.printf("\n# 1.(자동으로) 뜨거운 물을 준비한다\n");
        System.out.printf("# 2.(자동으로) 종이컵을 준비한다\n");

        switch (button) {
            case 1:
                System.out.printf("# 3.(자동으로) 아메리카노를 탄다\n"); break;
            case 2 :
                System.out.printf("# 3.(자동으로) 유자차를 탄다\n"); break;
            case 3 :
                System.out.printf("# 3.(자동으로) 설탕커피를 탄다\n"); break;
            default:
                System.out.printf("# 3.(자동으로) 아무거나 탄다\n"); break;
        }

        System.out.printf("# 4.(자동으로) 물을 붓는다\n");
        System.out.printf("# 5.(자동으로) 스푼으로 저어서 녹인다\n\n");



        return 0; // void가 아니라 int이므로 return(반환) 안하면 에러남.

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int coffee;
        int ret;

        System.out.printf("A고객님, 어떤 커피 드릴까요? (1:아메리카노, 2:유자차, 3:설탕커피)");
        coffee = s.nextInt();
        ret = coffee_machine(coffee);
        System.out.printf("A고객님 커피 나왔습니다.\n\n");

        System.out.printf("기다려주셔서 감사합니다. B고객님, 어떤 커피 드릴까요? (1:아메리카노, 2:유자차, 3:설탕커피)");
        coffee = s.nextInt();
        ret = coffee_machine(coffee);
        System.out.printf("B고객님~ 커피 나왔습니다.\n\n");

        System.out.printf("기다려주셔서 감사합니다. C고객님, 어떤 커피 드릴까요? (1:아메리카노, 2:유자차, 3:설탕커피)");
        coffee = s.nextInt();
        ret = coffee_machine(coffee);
        System.out.printf("C고객님 커피 나왔습니다.\n");

    }
}


