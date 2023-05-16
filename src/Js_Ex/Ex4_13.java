package Js_Ex;

public class Ex4_13 { // while문으로 1부터 몇까지 더해야 100을 넘지 않는지 알아내는 예제
    public static void main(String[] args) {
        int sum = 0; // 증가시킨 값의 합을 저장할 변수
        int i = 0; // 1씩 증가시킬 변수

        while (sum <= 100) { // 조건식이 참인 동안 == 조건식이 거짓이 될 때까지 블럭 내의 문장을 반복
            System.out.printf("%d일 때 합은 %d%n", i, sum); // %n == \n
            sum += ++i; // i를 1 증가시킨 후에, sum과 더한 값을 sum에 대입하는 코드.
        }
    }
}
