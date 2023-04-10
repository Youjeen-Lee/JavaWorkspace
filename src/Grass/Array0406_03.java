package Grass;

public class Array0406_03 {
    public static void main(String[] args) {

        int [] arr = new int [4];     // int arr을 길이가 4인 배열로 선언한다.

        for(int i =0; i < 4; i++) {   // i가 0부터 4보다 작으면 배열 arr의 인덱스에 i+1의 값을 대입한다.
            arr[i] = i + 1;           // i=0일 때 arr[1], i=1일 때 arr[2], i=2일 때 arr[3], i=3일 때 arr[4]
        }
        int sum = 0;                  // 정수형 변수 sum을 초기화해준다 == 메모리에 값이 없는 채로 호출되는 경우를 막기위해서 & 변수를 사용하려면 최소 한번 초기화해야함
        float avg = 0;                // 실수형 변수 avg를 초기화해준다

        for(int i : arr) {            // for each문 : arr(객체)의 길이(크기)만큼 반복한다. int i를 반복한다?
                                      // 근데 여기서 i가 뭐지? i=0? / arr[i]인 arr[0]의 값? / 아니면 arr의 길이?

            sum += i;                 // sum = sum + i 를 arr 길이만큼 반복한 후 for문 나감
        }

        avg = sum / (float) arr.length ;  // 대입은 우선순위가 가장 낮은 연산자이므로 마지막에, 실수형으로 강제 형변환된 arr의 배열의 길이로 나눈 sum을 avg에 대입한다.
        System.out.println("arr 배열의 평균 :" + avg); // 출력문에서 ""를 사용하면 소괄호 속 문장 전체를 문자열로 인식하게 한다. '+' 기호를 사용하면 두 문장이 ""가 있는 문장(?) 안으로 병합됨.
    }
}
