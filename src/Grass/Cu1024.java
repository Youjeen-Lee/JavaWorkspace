package Grass;

import java.util.Scanner;

public class Cu1024 { // 단어 1개 입력받아 나누어 출력하기
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String word = scn.nextLine();
        String[] wordArr = word.split(""); // 글자별로 쪼개줌
        int i;
// 풀이(1) 문자열의 길이와 charAt 이용
//        for (i = 0; i < word.length(); i++) { // 한글자씩 출력해야하므로 반복문 이용
//            System.out.printf("'%s'\n", word.charAt(i));

// 풀이(2) 배열의 길이를 이용 (Java에서 이 풀이를 더 좋아하네.. 왜지?)
            for (i = 0; i < wordArr.length; i++) {
                System.out.printf("'%s'\n", wordArr[i]);
        }
    }
}

// 배열의 길이를 구할 때는 배열이름.length;
// 문자열의 길이를 구할 때는 문자열이름.length();
// 큰, 작은 따옴표는 메타문자가 아니므로 이스케이프 처리 X
