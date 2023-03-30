package polyquiz;

public class PolyQuiz0330_2 {
    public static void main(String[] args) {
        int i;
        int j;


        for (i = 1, j = 2; j < 10; i++) {
            System.out.printf("%d * %d = %d \n", j, i, i * j);


            if (i >= 9){
                j++;
                i = 0;

               System.out.printf("\n");
            }

        }

        int k = 0;
        for (System.out.printf("first\n"); k < 10; System.out.printf("++ --\n") ) {

            System.out.printf("main\n");

            k++;
        }
    }

}
