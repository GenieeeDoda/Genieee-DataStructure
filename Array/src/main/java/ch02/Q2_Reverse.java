package ch02;

import java.util.Scanner;

public class Q2_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numberLine = sc.nextLine();

        String []str = numberLine.split(" ");

        int []a = new int[str.length];

        for (int i=0;i<str.length;i++) {
            a[i] = Integer.parseInt(str[i]);
        }

        reverseArray(a);
    }

    static void reverseArray(int [] a) {
        for (int i=0;i<a.length/2;i++) {
            System.out.println("a["+i+"] 과(와) a["+(a.length-i-1)+"]를 교환합니다.");
            int tmp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = tmp;

            for (int j=0;j<a.length;j++) {
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }

        System.out.println("역순 정렬을 마쳤습니다.");
    }
}
