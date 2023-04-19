package polyquiz;

public class PQ_StarUpsidedown {
    public static void main(String[] args) { // 거꾸로 삼각형 별찍기
        for (int i = 1; i < 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

// 변수j 가 5에서 -1까지 떨어지고 j가 i보다 클때만 '*'을 출력한다.