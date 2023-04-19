package polyquiz;

import java.util.Scanner;

public class PQ_ArrayAsceNotOverlap { // 입력받은 숫자를 중복없이 크기가 작은순으로 정렬
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 길이를 입력해주세요. : ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.println(i + 1 + "번째 배열에 값을 넣은 후 엔터를 치세요. : ");
            int nm = sc.nextInt();
            a[i] = nm;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    System.out.println("중복값을 입력하셨습니다. 다시 입력 해주세요. : ");
                    --i;
                    break;
                }
            }
        }
        int change;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    change = a[i];
                    a[i] = a[j];
                    a[j] = change;
                }
            }
            System.out.print(a[i] + " ");
        }
    }
}


