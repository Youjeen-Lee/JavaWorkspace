package Grass;

public class Array0406_03 {
    public static void main(String[] args) {

        int [] arr = new int [4];

        for(int i =0; i < 4; i++) {
            arr[i] = i + 1;
        }
        int sum = 0;
        float avg = 0;

        for(int i : arr) {
            sum += 1;
        }

        avg = sum / (float) arr.length ;
        System.out.println("arr 배열의 평균 :" + avg);
    }
}
