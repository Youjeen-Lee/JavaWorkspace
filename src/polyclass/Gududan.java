package polyclass;

public class Gududan {
    public static void main(String[] args) {
        int i, k;

        for( i = 2; i < 10; i++)
        {
            System.out.println(i + "단 시작합니다.");
            for( k = 1; k < 10; k++) // (주의!) i++
            {
                System.out.println(i + "x" + k + "=" + i * k);
            }
            System.out.println(i + "단 끝났습니다.");
       }
            System.out.println(); // println = \n
    }

}

