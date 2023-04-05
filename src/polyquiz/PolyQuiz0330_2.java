package polyquiz;

public class PolyQuiz0330_2 {
    public static void main(String[] args) {
        int i;
        int j;


        for (i = 1, j = 2; j < 10; i++) {                           // (1) i=1 초기값, j는 2부터 10보다 작을 때까지 아래의 구구단 식을 출력한다.
            System.out.printf("%d X %d = %d \n", j, i, i * j);


            if (i >= 9){                                            // (2) i값이 9보다 크거나 같을 때 if문을 실행하여 j에 j+1의 값을 저장한 후 i값을 0으로 초기화시킨다.
                j++;
                i = 0;

               System.out.println();                             // (3) 줄 바꿔주고 for문으로 돌아가 반복한다.
            }
        }
    }
}
