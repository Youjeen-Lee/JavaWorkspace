package polyquiz;

import java.util.Scanner;

public class PolyQuiz0412 {
    public static void main(String[] args) {
        System.out.println("정수 5개를 입력하세요. : ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("최대값은 " + max + " 입니다.");

        int min = 0;
        for(int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt();
            if(min > arr[j]) {
                min = arr[j];
            }
        }
        System.out.println("최소값은 " + min + " 입니다.");

//        int avg = 0;
//
//        for()

    }
}
