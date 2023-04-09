package Grass;
import java.util.Scanner;

public class BJ10807 { // 개수 세기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0; // 변수 카운트 초기화5

        int N = sc.nextInt(); // 정수형 변수 N에 입력값을 받는다. (배열의 길이)
        int[] arr = new int[N]; // int arr을 길이가 N인 배열로 선언한다

        for(int i = 0; i < N; i++) {  // i가 0부터 N보다 작을 때까지
            arr[i] = sc.nextInt();    // 길이가 i인 배열 arr에 값을 입력받는것을 증감식을 통해 반복한다( i의 수를 순서대로 출력하는게 아닌 횟수를 반복하는것)
        }
        int v = sc.nextInt(); // 정수형 변수 v에 입력값을 받는다. (개수를 세 정수)

        for(int j = 0; j < arr.length; j++) { // j가 0부터 시작하여 배열 arr의 길이보다 작으면 아래의 if문을 실행
            if(v == arr[j]){ // if문 조건에 안맞으면 위로 올라가 j++ 해준 후 다시 내려온다.
                count++; // if문 조건에 맞으면 count의 수를 올려라, i++같은거임
            }
        }
        System.out.print(count); // 마지막줄이니까 그냥 print 써도됨. 밑에 아무것도 없으니 띄워줄 필요 없기때문
    }
}
