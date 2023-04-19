package polyquiz;

public class PQ_StarUpsidedown2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i < j) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
//  j가 1부터 5보다 작을때 1씩 증가하고 j가 1보다 클 때만  '*'을 출력한다.
