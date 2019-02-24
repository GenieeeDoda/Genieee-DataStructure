package ch01;

import java.util.Scanner;

public class Ch1_2_TriangleLB {
    public static void main(String[] args) {
        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
        System.out.print("단 수 : ");

        Scanner stdIn = new Scanner(System.in);

        int num = stdIn.nextInt();

        for(int i=1;i<=num;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
