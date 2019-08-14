package ch02;

import java.util.Scanner;

public class Q3_sumOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] a = new int[num];

        for (int i=0;i<num;i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(sumOf(a));
    }

    static int sumOf(int[] a) {
        int sum = 0;

        for (int i=0;i<a.length;i++) {
            sum += a[i];
        }

        return sum;
    }
}
