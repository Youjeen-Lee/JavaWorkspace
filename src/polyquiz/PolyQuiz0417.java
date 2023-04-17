package polyquiz;

import java.util.Scanner;

public class PolyQuiz0417 { // 오늘의 퀴즈 하얗게 불태웠다..^_ㅜ
    public static void main(String[] args) {

        // 입력값을 받기위해 스캐너 생성
        Scanner sc = new Scanner(System.in);
        // 크기가 5인 정수형 배열을 생성
        int[] arr = new int[5];
        // for문을 이용하여 배열에 정수 5개를 입력받음
        System.out.println("정수 5개를 차례대로 입력하세요: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        // 중복된 숫자가 있으면 뒤에 나온 숫자를 -1로 바꿈(정수 입력받을꺼니까 입력안될 수로 설정)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = -1;
                }
            }
        }
        // 이제 배열에 저장된 값 중 -1이 아닌 값만 출력함
        // 마지막 입력값에 쉼표를 출력하지 않기 위한 flag 변수 생성, false일 때 마지막 숫자가 아닌 숫자를, true일 때 마지막 숫자를 출력.
        System.out.print("저장된 값은 ");
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) { // 마지막 숫자가 아니면 쉼표 출력
                    System.out.print(",");
                } else { // 마지막 숫자는 true가 되어 쉼표없이 출력
                    flag = true;
                }
            }
        }
        System.out.print(" 입니다.");
        }
    }
// * flag 변수의 초기값을 false로 설정하는 이유 : 출력되는 수가 여러개인 경우 false로 설정하는 것이 더 간단한 코드이므로 ==> 그러니까 왜??
