package Grass;

import java.util.Scanner;

public class Cu1019 { //년월일을 "."로 구분해 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 년월일을 한줄로 입력받기 위해 nextLine 사용
        String date = sc.nextLine();
        // split() 함수는 잘라진 문자열을 배열에 저장하여 리턴함.
        // "문자열을 잘라줄 구분자" , 온점은 정규식을 제어할 수 있는 메타문자이므로 '\\'를 붙여서 이스케이프 처리 해준다.
        String [] dateArr = date.split("\\."); // 이스케이프 : ?,*,+,(),[],{} 는 split 불가 하므로 메타문자 앞에 역슬래쉬 2개를 붙임

        // 배열에 연월일 순서대로 들어가도록 값을 저장
        String year = dateArr[0];
        String month = dateArr[1];
        String day = dateArr[2];

        // 문자열을 숫자로 변환해주기위해 integer.valueOf 메소드 사용
        int y = Integer.valueOf(year);
        int m = Integer.valueOf(month);
        int d = Integer.valueOf(day);
        // 출력문에서 온점으로 구분
        System.out.printf("%04d.%02d.%02d", y, m, d);

    }
}


