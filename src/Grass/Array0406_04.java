package Grass;

public class Array0406_04 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};   // 길이가 6인 변수 arr을 선언하고 각각의 배열에는 10~60의 값이 저장되어있음.

        int max = 0; // 최댓값을 구할 변수를 사용하기 위해 초기화해줌
        int maxIdx = 0; // 최댓값의 인덱스 선언 ==> 몇번째 숫자인지 알기위해
        for (int i = 0; i < arr.length; i++) { // 0일 때 arr 길이 6보다 작으므로 if문으로 간다. max는 0이므로 arr[0]=10보다 작으므로 if문 실행
                                               // max에 10을 대입한다. maxidx에는 0을 대입하고 다시 반복문으로 돌아가 i=1이 되어 반복문 실행
            if (max < arr[i]) {                // max는 0으로 초기화되어 여전히 arr[1]=20보다 작으므로 max에 20의 값을 대입하고 인덱스에는 1을 저장하고 반복문으로 돌아감
                max = arr[i];                  // 이렇게 반복해서 i=5일 때 max = 60, maxidx = 5가
                maxIdx = i;
            }
        }

        System.out.println("최댓값은 "+max+" 이고, 배열의 "+(maxIdx+1)+"번째에 있습니다.");
    }
}
