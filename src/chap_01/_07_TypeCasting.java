package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args){
        // 형변환 TypeCasting 이란?
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int score = 93 + 98.8; 정수형 변수에 실수값을 입력했기 때문에 에러 int -> double로 바꿔야함

        // int to float, double (정수에서 실수로)
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0 (float은 실수형)
        System.out.println((double) score); // 93.0 (double도 실수형)



        // float, double to int (실수에서 정수로)
        float score_f = 93.3F;
        double score_d = 98.8;
        System.out.println((int) score_f);
        System.out.println((int) score_d);



        // 정수 + 실수 연산
        score = 93 + (int) 98.8; // 93 + 98
        System.out.println(score); // 191

        score_d = 93 + 98.9; // 93.0 + 98.9 , 93앞에 double 안 적어줘도 자동적용 (왜??)
        System.out.println(score_d); // 191.9



        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double (더 숫자가 크고 정밀, 이 순서로 갈 때는 자동 형변환)

        int convertedScoreInt = (int)score_d; // 191.8 -> 191
        // double -> float -> long -> int (수동 형변환)



        // 숫자를 문자열로 (93이 출력되는데 왜 문자열이라는거?)
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1); // 93


        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.9);
        System.out.println(s2); // 98.8

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i); // 93
        double d = Double.parseDouble("98.8");
        System.out.println(d); // 98.8










}
}
