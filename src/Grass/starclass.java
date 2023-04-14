package Grass;

import java.util.Scanner;

public class starclass {
    public static void main(String[] args) {
// <출력>
//        // print, println 문자를 정수로 인식함(아스키코드)
//        int a=1, b=2;
//        System.out.print(a); // ==> 1
//        System.out.println(a+b); // ==> 3
//        System.out.println(a+b+'일'+'이'); // ==> 3 + 일과 이의 아스키코드 숫자
//        System.out.print('일'+'이'+a+b+"\t"); // ==> 3 + 일과 이의 아스키코드 숫자 ("\n", |\t"는 큰 따옴표 안에 씀.)
//        System.out.println(a+b+"일"+"이"); // => 3일이, ""쓰면 문자로 인식
//        System.out.println("일"+"이"+a+b); // => 일이12, 문자열부터 써서 컴퓨터가 숫자가 아닌 문자로 인식해 더하지않음
//
// <배열>
// (1) 배열생성 (2) 배열 값 넣기 (3) 정렬 (4) 출력 + 중복된 수 x (==> 조건이니까 if)

        Scanner sc = new Scanner(System.in);
        System.out.println("배열의 길이를 입력해주세요. : 1~100 정수입력");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.println(i+1 + "번째 배열에 값을 넣어주세요. : 1~100의 정수입력 후 엔터!");
            int nm = sc.nextInt();
            a[i] = nm;   // 배열의 인덱스는 무조건 0부터 시작 ==> [0][1][2][3][4] ( 버블정렬, 선택정렬, 삽입 정렬 공부 )
                for (int j = 0; j < i; j++) {
                    if (a[i] == a[j]) {
                        System.out.println("중복을 입력하셨습니다. 다시 입력 해주세요.");
                        --i;
                        break;
                    }
                }

        }
        //[0] [1][2][3][4]
        //[1] [2][3][4]
        //[2] [3][4]
        //[3] [4]
        int change;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    change = a[i];       // a와 b의 값을 교환하기위해 변수 c를 만들어줌(그냥 a=b하면 a의 값이 사라지므로) ==> (1) a=c (2) b=a (3) c=b
                    a[i] = a[j];
                    a[j] = change;
                }
            }
            System.out.print(a[i] + " ");
        }

        // 중복이되면 ==> 방법1.프로그램 종료 / 방법2. 중복이니 다시 쓰세요.
        // 중복이니 다시쓰라고 하는 방법 ㄱㄱ

    }

}
