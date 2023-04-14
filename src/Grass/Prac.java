package Grass;

import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //배열의 갯수
        int N = sc.nextInt();
        int[] arr = new int[N];

        //배열의 값을 넣음
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //찾으려고 하는 정수 입력
        int v = sc.nextInt();

        //카운트 선언
        int count = 0;
        //모든 배열에 찾으려고 하는 정수 v 가 있는지 확인하는 로직.
        for (int j = 0; j < arr.length; j++) {
            if (v == arr[j]) {      //4 ==
                count++;
            }
        }
        System.out.print(count);
    }
}
