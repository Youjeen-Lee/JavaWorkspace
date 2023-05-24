package Grass;

import java.util.Scanner;

public class Cu1034 { // 코드업 기초예제 1034 8진수로 입력받아 10진수로 출력
    public static void main(String[] args) {

                Scanner scn = new Scanner(System.in);

                String data = scn.nextLine();

                //먼저 문자열로 입력받고

                int dataInt = Integer.valueOf(data, 8);

                //문자열을 8진수로 변환


                System.out.printf("%d",dataInt);

                //8진수를 10진수로 출력

                scn.close();
            }
        }


