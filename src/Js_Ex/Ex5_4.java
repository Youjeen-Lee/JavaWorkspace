package Js_Ex;

import java.util.Arrays;

public class Ex5_4 { // 0~9까지 임의의 값을 100번 섞은 후 배열의 요소 섞기
    public static void main(String[] args) { // 길이가 10인 배열 생성
        int[] numAry = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numAry)); // Arrays.toString() 배열의 모든 요소를 문자열로 출력

        for ( int i = 0; i < 100; i++) { // 교환하는 일을 100번 반복
            int n = (int)(Math.random() * 10); // 0~9 중의 한 값을 임의로 얻는다.

            int tmp  = numAry[0]; // (1) numAry[0]의 값을 변수 tmp에 저장. (numAry[0]을 비워줌)
            numAry[0] = numAry[n]; // (2) numAry[n]의 값을 numAry[0]에 저장. (numAry[0] 채워주고 numAry[n]을 비움)
            numAry[n] = tmp; // (3) tmp 변수의 값(== numAry[0]의 값)을 numAry[n]에 저장. == 결과적으로 numAry[0]와 numAry[n] 값을 교환!!
        }
        System.out.println(Arrays.toString(numAry));

    }
}

// q. 11행에서 9까지의 수가 필요한데 왜 '* 10'인가? :
// Math.random() 메소드가 반환하는 값은 0.0 이상 1.0 미만의 double 값입니다.
// 따라서, Math.random() * 10의 결과는 0.0 이상 10.0 미만의 double 값이 나오게 됩니다.
// 이때, 소수점 아래를 버리기 위해 (int)를 사용하여 정수형으로 변환하면, 0 이상 9 이하의 정수 값이 나오게 됩니다.
// 이것은 자바에서 정수형을 처리하는 방식 때문입니다. 만약 0부터 10까지의 정수를 얻고자 한다면, (int)(Math.random() * 11)과 같이 작성해야 합니다.
