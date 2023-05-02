package polyquiz;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class PQ_LinkedList { // 5개의 입력 받는 정수를 큰 순서대로 출력(연결리스트 사용)
    public static void main(String[] args) {

        LinkedList<Integer>list = new LinkedList<>();    // 정수형 값을 사용할 연결 리스트 생성, <변수타입>
        Scanner sc = new Scanner(System.in);             // 스캐너 생성

        for(int i = 0; i < 5; i++) // 반복문 이용하여 리스트에 값을 넣는 작업
        {                          // *** 자꾸 for문 옆에 ; 넣지마!!!!!!!!!!
            list.add(sc.nextInt());                      // list의 add 메소드 사용하여 리스트에 값 집어 넣기. "()" 붙는 건 메소드란 의미
        }


        Collections.sort(list, Comparator.reverseOrder());  // Collections의 sort 메소드를 빌려와 list가 내림차순으로 정렬하게끔 한다.(정렬의 기본값은 오름차순, list 뒤에 안적어도됨)

        for (Integer i : list) {                            // list의 값만큼 정수 i를 가져와 반복한다.
            System.out.print(i + " ");                     // 반복문 사용해서 리스트 전체 값 출력하기

        }
    }
}
