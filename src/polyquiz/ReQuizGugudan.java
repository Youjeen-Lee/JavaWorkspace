package polyquiz;

public class ReQuizGugudan { // 구구단 옆으로 출력하기 Quiz 복습!
    public static void main(String[] args) {


        for(int i=2; i<=9; i++) {
            for(int j=1; j<=9; j++) {
                System.out.print(i + " * " + j + " = " + i * j + "\t");
            }
            System.out.println();
        }
    }
}

// 바깥 for문은 단을, 2번째 for문은 1~9까지의 수를 곱하는 반복문
// "\t"를 ""로 감싸야하는 이유 ==> 출력문 안에서 그냥 탭 문자를 사용하면, 일반 문자로 출력되어 정렬이 제대로 되지않음
// 이때, \t를 큰 따옴표로 감싸서 문자열로 인식하도록 만들면 탭 문자를 출력할 수 있다.
// 문자열과 일반 문자의 차이 ==> 문자열은 문자들의 시퀸스이고 큰 따옴표로 감싸서 표현하며 여러개의 문자를 하나의 문자열로 묶어서 처리할 수 있다.
//                           일반 문자는 단일 문자이며 작은 따옴표로 감싸서 표현해 하나의 문자만을 나타낸다. 둘은 서로 다른 데이터 타입임.