package polyquiz;

public class PQ_GugudanWhile { // while 1번만 써서 구구단 만들기
    public static void main(String[] args) {

        int i, j;
        i = 1;
        j = 2;

        while(j < 10) {
            System.out.printf(" %d X %d = %d \n", j, i, i*j);
            i++;  // 증감식이 구구단 출력문 아래에 있어서 i=10이 되어도 2*10의 값이 출력되지않음

            if( i == 10) {
                j++ ; i = 1;  // j++로 단이 바뀌고 i의 값은 10에서 1로 초기화됨
                System.out.println();
            }

        }
    }
}
