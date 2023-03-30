package polyclass;

public class Ex05_02 {
    public static void main(String[] args) {
        int a = 200;

        if(a < 100) {
            System.out.printf("100보다 작군요..\n"); // if문은 바로 아래에 1줄에만 적용된다.
            System.out.printf("거짓이므로 이 문장은 안보이겠죠?\n"); // 2줄이상 실행하고 싶으면 {}로 묶어줘야함
        }

            System.out.printf("프로그램 끝! \n");
    }
}
