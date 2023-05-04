package polyclass;

import java.util.Scanner;

public class Ex0503_5 { // 다양한 문자열 메소드 : Replace, subString, split
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, strRep, strRep2, strSub, strAry[]; // 스캐너로 입력받을 문자열, 원하는 문자로 치환할 문자열, 치환할 문자열2, 일부 추출할 문자열, 분리할 문자열 배열을 선언

        System.out.print("문자열을 입력하세요 : ");
        str = sc.nextLine();

        strRep = str.replace(" ", "$");
        strRep2 = str.replaceAll("\\s", "\\$"); // 입력 문자열의 공백을 $로 바꾼다.(s는 문자열 s가 아니라 공백 space를 의미하는 특수문자 s임)
        strSub = str.substring(3,8);                            // 입력 문자열의 세번째부터 여덟번째 문자를 추출한다.
        strAry = str.split(" ");                          // 입력 문자열을 공백으로 분리한다.

        System.out.println("입력 문자열 ==> " + str);
        System.out.println("바꾼 문자열 ==> " + strRep);
        System.out.println("바꾼 문자열2 ==> " + strRep2);
        System.out.println("일부 문자열 ==> " + strSub);

        for (int i = 0; i < strAry.length; i++) {                        // 분리한 문자열 배열을 하나씩 출력한다. // 자꾸 i=01 이렇게 오타내고 ; 안붙임 주의!!
            System.out.println("분리한 문자열 " + i + " ==> " + strAry[i]);
        }
    }
}


// 라디오버튼, 체크박스? ==> split 함수 활용
// 메소드? 함수? 명령어?에서 어떤건 대문자로 시작하고 어떤건 소문자로 시작하는데 왜??
// 또 메소드 사이에 . 을 찍는 이유는?