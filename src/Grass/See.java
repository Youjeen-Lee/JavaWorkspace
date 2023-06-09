package Grass;

public class See {
    public static void main(String[] args) {
        int a, b;
        for(a = 1, b = 1; b < 6; a++) {
            System.out.print("*");
            if(a>=b){
                a = 0;
                b++;
                System.out.println();
                // (1) a와 b=1부터 시작해서 b가 6보다 작을 때까지 "*"를 출력한다.
                // (2) a가 b보다 크거나 작을 때는 if문을 실행하여 a값을 초기화하고 b++을 한 후 줄바꿈
                // (3) b++하여 b=2, a=0인 상태에서 for문으로 돌아와서 (1)a++로 a=1이 되고, b=2이므로
                //     if문으로 가지않고 b < 6 조건에 성립하므로 * 하나찍고 다시 for문으로 돌아가 (2)a++ 실행
                // (4) a=2, b=2이므로 if문으로 가 * 찍어주고 줄바꿈
                // (5) 다시 for문으로 돌아오면 a=1, b=3인 상태 if문 가지않고 * 찍고 다시 for문으로 와 (3)a++
                //     a=2, b=3이므로 * 찍고 다시 (4)a++ a=3, b=3이 되어 if문 발동! ==> ***까지 찍음
                // (6) 다시 a=1, b=4에서 a=4가 될때까지 같은줄에서 *만 출력되고 a=4가 되면 if문으로 가 줄바꿈
            }   // (7) 마지막! 초기화된 a가 a=1에서 a=5가 될 때까지 반복
        }
    }
}
