package polyquiz;

public class PQ_StarReverse { // 반대 방향으로 삼각형 별찍기 ==> 변수 순서만 바꿔주면됨.
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 5; j > 0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
