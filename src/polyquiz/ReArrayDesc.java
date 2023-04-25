package polyquiz;

import java.util.Scanner;

public class ReArrayDesc { // 자바 퀴즈 복습
    public static void main(String[] args) {
        // 직접 입력할꺼니까 스캐너 선언
        Scanner sc = new Scanner(System.in);
        // 5개의 입력 받는 정수로 길이가 5인 배열 생성
        int[] a = new int[5];
        // 0부터 배열의 길이값보다 작을때까지 하나씩 커지며 총 5번 반복
        for (int i = 0; i < a.length; i++) {
            // 내가 입력하는 수는 배열의 각 인덱스의 값 안에 들어갈 것
            a[i] = sc.nextInt();
        }
        // 값을 교환하기 위하여 새로운 변수 하나 생성하고 비워놓기 (0으로 초기화)
        int tmp = 0;

        // 배열 안의 수들을 내림차순으로 정렬할 것
        for (int i = 0; i < a.length; i++) { // 위에 쓴 거랑 같음. 총 5번 반복
            for (int j = i + 1; j < a.length; j++) { // 시작값이 i+1인 이유 : 순서대로 사용한 인덱스는 제외하고 반복문 돌리려고
                if (a[i] > a[j]) {                 // 반복문 안에 조건문 달아둠. 만약 a[i]가 a[j]보다 작다면(앞의 수가 뒤의 수보다 작다면)
                             tmp = a[i];           // 작은 수를 변수 tmp에 담아두고
                             a[i] = a[j];          // 큰 수를 작은 수를 담고 있던 인덱스로 옮겨온다.
                             a[j] = tmp;           // 그리고 큰 수가 있던 자리에는 tmp가 갖고 있던 값이 들어간다.(작은 값)
                }                                  // + 부등호 방향만 바꾸면 오름차순으로 바꿀 수 있음
            }
        }
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

