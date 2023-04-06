package Grass;

public class Array0406_04 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60};

        int max = 0;
        int maxIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIdx = i;
            }
        }

        System.out.println("최댓값은 "+max+" 이고, 배열의 "+(maxIdx+1)+"번째에 있습니다.");
    }
}
