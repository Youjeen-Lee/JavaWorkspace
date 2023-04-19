package polyquiz;

import java.util.Scanner;

public class PQ_ArraysMaxMinAvg { // 배열을 이용하여 정수의 최대 최소 평균
    public static void main(String[] args) {

        int [] arr = new int[5]; // 길이가 5인 정수형 배열 선언 ==> 5번 쓰겠다!

        Scanner sc = new Scanner(System.in); // 값을 입력받는 Scanner 선언

        for(int i = 0; i < arr.length; i++) { // i는 0부터 배열의 길이(=5)보다 작을 때까지 i에 1씩 더해가며 반복(숫자가 커지는게 아니라 횟수를 나타냄)
            arr[i] = sc.nextInt(); // 입력값을 인덱스 i번째에 집어넣는다. (ex : 첫번째 순서에 10을 입력하면 arr[0]=10이 됨)
        }
        int max = arr[0];
        int min = arr[0];
        int sum = 0; // sum은 0으로 초기화 해주는 이유 : 연산식이 들어가므로 가장 기본값인 0으로 초기화
        float avg = 0; // sum과 마찬가지로 0으로 초기화

        for(int i =0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i]; // *주의 : 왼쪽에 있는 변수가 값을 받으므로 반드시 max가 =의 왼쪽에 있어야 한다.
            } else if(arr[i] < min) {
                min = arr[i];
            }
            sum = sum + arr[i]; // 값이 누적되어야하므로 반복문 안에 있어야함
        }
        avg = sum / (float) arr.length;

        System.out.printf(" 최대값은 %d, 최소값은 %d, 평균은 %f", max, min, avg);
    }
}


// 0이 아닌 배열의 첫번째 값으로 초기화하는 이유는  ==> 기준을 세워서 비교를 쉽게하기 위함
// for문을 쓰는 이유 : 증감식을 통해 일정한 방향으로 비교를 할 수 있으므로 편리하다.
// if문을 쓰는 이유 : 최대 최소 값을 구하기위해 인접한 두 수의 크기 비교