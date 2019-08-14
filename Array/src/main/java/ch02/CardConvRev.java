package ch02;

import java.util.Scanner;

public class CardConvRev {
    static int cardConvRev(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x = x / r;
        } while (x != 0);

        return digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int beforeNum;
        int cd;
        int afterNumDigits;
        int isRetry;
        char[] str = new char[32];

        System.out.println("10진수를 기수 변환합니다.");

        do {
            do {
                System.out.print("변환하는 음이 아닌 정수 : ");
                beforeNum = sc.nextInt();
            } while (beforeNum < 0);

            do {
                System.out.print("어떤 진수로 변환할까요? (2~36) : ");
                cd = sc.nextInt();
            } while (cd < 2 || cd > 36);

            afterNumDigits = cardConvRev(beforeNum, cd, str);

            System.out.print(cd + "진수로는 ");
            for (int i=afterNumDigits-1;i>=0;i--) {
                System.out.print(str[i]);
            }
            System.out.println("입니다.");


            System.out.print("한 번 더 할까요? (1.예/0.아니오) : ");
            isRetry = sc.nextInt();
        } while (isRetry == 1);

    }
}
