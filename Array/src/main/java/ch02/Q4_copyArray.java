package ch02;

import java.util.Scanner;

public class Q4_copyArray {
    static void copy(int[] x, int[] y) {
        for (int i=0; i < y.length; i++){
            x[i] = y[i];
        }
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

        copy(a,b);
    }
}
