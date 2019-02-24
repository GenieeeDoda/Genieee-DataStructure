package ch01;

import java.util.Scanner;

public class Ch1_2_Q15 {
    public static void main(String[] args) {
        System.out.print("단 수 : ");

        Scanner stdIn = new Scanner(System.in);

        int num = stdIn.nextInt();

        triangleLB(num);
        System.out.println();
        triangleLU(num);
        System.out.println();
        triangleRU(num);
        System.out.println();
        triangleRB(num);
        System.out.println();
    }

    static void triangleLB(int n) {
        for(int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLU(int n) {
        for(int i=1;i<=n;i++) {
            for (int j=n;j>=i;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n) {
        for(int i=1;i<=n;i++) {
            for(int k=1;k<i;k++) {
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    static void triangleRB(int n) {
        for(int i=1;i<=n;i++) {
            for(int k=n; k>i;k--) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
