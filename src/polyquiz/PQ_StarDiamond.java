package polyquiz;

public class PQ_StarDiamond {
    public static void main(String[] args) { // 별찍기로 마름모 절반

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 6; i < 11; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();

            // if, else 함수 써보기!

        }
    }
}