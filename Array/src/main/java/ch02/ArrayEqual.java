package ch02;

import java.util.Scanner;

public class ArrayEqual {
    static boolean equals(int[] x, int[] y) {
        if (x.length != y.length) {
            return false;
        }

        for (int i=0; i < x.length; i++) {
            if (x[i] != y[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열 a의 요솟수 : ");
        int numA = sc.nextInt();

        int[] a = new int[numA];

        for (int i=0; i<numA; i++) {
            System.out.print("a["+i+"] : ");
            a[i] = sc.nextInt();
        }

        System.out.print("배열 b의 요솟수 : ");
        int numB = sc.nextInt();

        int[] b = new int[numB];

        for (int i=0; i<numB; i++) {
            System.out.print("b["+i+"] : ");
            b[i] = sc.nextInt();
        }

        System.out.println("배열 a와 b는 "+(equals(a,b) ? "같습니다." : "같지 않습니다."));
    }
}
