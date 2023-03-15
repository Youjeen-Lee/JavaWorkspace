package polyquiz;

import java.sql.SQLOutput;

public class _ByulStamp {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int k = 5; k < 10; k++) {
            for (int l = 10; l > k; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}