package polyclass;

public class Ex07_09 {
    public static void main(String[] args) {
        int hap = 0;
        int i;

        for(i = 1; 1 <= 100; i++) {
            hap = hap + i;      // 자꾸 i를 1로 쓴다 정신차려!

            if(hap >= 1000) {  // 숫자 오타 확인!!
                break;
            }
            System.out.printf("1~100의 합에서 최초로 1000이 넘는 위치는? : %d\n", i); // "" 개수 확인!!
         }
    }
}

