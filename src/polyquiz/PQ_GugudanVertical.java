package polyquiz;

public class PQ_GugudanVertical {
    public static void main(String[] args) { // for문 1개로 구구단 출력
        int i;
        int j;


        for (i = 1, j = 2; j < 10; i++) {
            System.out.printf("%d X %d = %d \n", j, i, i * j);


            if (i >= 9){
                j++;
                i = 0;

               System.out.println();
            }
        }
    }
}
