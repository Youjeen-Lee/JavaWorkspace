package Grass;

import java.util.Scanner;

public class Cu1026 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String time = scn.nextLine();
        String[] timeAry = time.split(":");

        String h = timeAry[0];
        String m = timeAry[1];
        String s = timeAry[2];

        System.out.println(Integer.parseInt(timeAry[1]));
    }
}
