package polyquiz;

public class PQ_Star1for {
    public static void main(String[] args) { // 반복문 하나로 별찍기 복습
        int i, j;
        for (i = 1, j = 1; j < 6; i++) { // for문에 ';' 쓰지않게 주의!! {} 꼭 확인할것

            System.out.print("*");
            if (i >= j) {
                i = 0;
                j++;
                System.out.println();
            }
        }
    }
}
// 항상 중괄호 개수와 위치 확인하는 습관 !!