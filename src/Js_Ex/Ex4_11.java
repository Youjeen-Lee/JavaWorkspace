package Js_Ex;

public class Ex4_11 { // ch.4 반복문으로 삼각형 모양 별을 출력
    public static void main(String[] args) {

        for(int i = 1; i <=5; i++) { // '=<' 라고 오타냄. 부등호가 왼쪽임!
            for(int j = 1; j <= i; j++ ) { // 두번째 반복문이 끝나면 j값은 초기화되므로 n줄마다 n개의 별을 찍을 수 있다.
                System.out.print("*");
            }
            System.out.println(); //
        }
    }
}
