package polyquiz;

public class PQ_GugudanSide { // 중첩 for문 이용하여 구구단 옆으로 출력하기
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) { // 2단부터 9단까지
            for (int j = 1; j <= 9; j++) { // 각 단의 곱셈 계산
                System.out.print(i + " * " + j + " = " + i * j + "\t"); // \t 왜 쓰는거지?
            }
            System.out.println(); // 한 줄 띄어쓰기
        }
    }
}
// 위 코드는 중첩된 for문을 이용하여 구구단을 옆으로 출력하는 코드입니다. 각각의 단에 대해 1~9까지 곱셈을 계산하고 그 결과를 출력합니다.
//
//for문을 이용하여 2단부터 9단까지 반복하도록 구성되어 있습니다. 바깥쪽 for문은 구구단의 단을 나타내며, 안쪽 for문은 각 단에서 1~9까지의 수를 곱하는 반복문입니다.
//
//System.out.print()를 이용하여 각각의 구구단을 출력하고, \t를 이용하여 탭 간격으로 구분하여 옆으로 출력합니다.
//
//한 줄에 구구단을 출력한 이후에는 System.out.println()을 이용하여 한 줄을 띄웁니다. 이를 통해 구구단을 옆으로 출력하는 것이 가능합니다.

