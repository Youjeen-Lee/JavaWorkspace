package polyquiz;

public class PQ_StarTriangle { // 한 줄의 최대 개수가 5개인 별로 삼각형 출력
        public static void main(String[] args) {

            int x, y; // 정수형 변수 선언 및 생성, for문에서 바로 값을 줄것이므로 초기화 생략

            for (x = 1, y = 1; y < 6; x++) {

                System.out.printf("*"); // y가 6보다 작으므로 *

                if (x >= y) { // 만약 x가 y보다 크거나 같으면 x를 0으로 초기화하고 y=y+1을 저장하고 줄바꿈
                    x = 0;
                    y++;
                    System.out.println();
                }
            }
        }
    }






