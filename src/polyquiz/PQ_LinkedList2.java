package polyquiz;


import java.util.LinkedList;
import java.util.Scanner; //import.java 라고 오타

public class PQ_LinkedList2 { //제시한 숫자들을 차례대로 입력하여, 중복된 값이 제거 되어 저장되도록 구현하시오.
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        for( int i=0; i<5; i++ ) {
            list.add(sc.nextInt());
        }

        for( int i=0; i<5; i++ ) {
            for( int j=i+1; j< list.size(); j++ ) { // j=0이라고 오타
                if( list.get(i) == list.get(j) ) {
                    list.remove(j);
                }
            }
        }

        for( Integer i : list )	 {
            System.out.print( i + " " );
        }
    }
}
