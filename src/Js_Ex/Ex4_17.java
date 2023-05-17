package Js_Ex;

public class Ex4_17 { // continue문을 이용해 3의 배수를 제외하고 1~10 사이의 숫자 출력
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0) { continue; } // 3으로 나눈 나머지가 0이면 3의 배수
                System.out.println(i);
            } // <== continue가 실행되면 이 조건문 블럭 끝으로 이동, 즉 continue문과 반복문 블럭의 끝 '}' 사이의 문장들을 건너뛰고 반복을 이어감
        }
    }

    // continue문은 반복문 내에서만 사용될 수 있으며, 반복이 진행되는 도중에 continue문을 만나면 반복문의 끝으로 이동하여 다음 반복으로 넘어간다.
    // for문의 경우 증감식으로 이동하며, while & do-while문의 경우 조건식으로 이동한다.

