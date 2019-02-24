package ch01;

import java.util.Scanner;

public class Ch1_2_Q17 {

    public static void main(String[] args) {
        System.out.print("단 수 : ");

        Scanner stdIn = new Scanner(System.in);

        int num = stdIn.nextInt();

        nspira(num);

    }

    static void nspira(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=n;j>i;j--) {
                System.out.print(" ");
            }

            for(int k=1;k<=2*i-1;k++){
                System.out.printf("%d",i%10);
            }

            System.out.println();
        }
    }
}
