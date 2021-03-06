package ch02;

import java.util.Scanner;

public class Q8_dayOfYear {
    static int [][] mdays = {
            {31,28,31,30,31,30,31,31,30,31,30,31}, // 평년
            {31,29,31,30,31,30,31,31,30,31,30,31}  // 윤년
    };

    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    static int dayOfYear(int y, int m, int d) {
        m = m-1;
        do {
            d += mdays[isLeap(y)][--m];
        } while (m > 0);

        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int retry;

        System.out.println("그 해 경과 일수를 구합니다.");

        do {
            System.out.print("년 : ");
            int year = sc.nextInt();
            System.out.print("달 : ");
            int month = sc.nextInt();
            System.out.print("일 : ");
            int day = sc.nextInt();

            System.out.printf("그 해 %d 일째입니다.", dayOfYear(year, month, day));

            System.out.print("한 번 더 계산할까요? (1.예/ 0.아니오) : ");
            retry = sc.nextInt();
        } while (retry == 1);
    }
}
