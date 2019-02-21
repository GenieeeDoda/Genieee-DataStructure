package ch01;

import java.util.Scanner;

// n이 7이면 1+2+3+4+5+6+7 = 28 을 출력하는 프로그램
public class Ch1_2_Q7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");

        int n = stdIn.nextInt();
        int sum = 0;

        for (int i=1;i<=n;i++) {
            System.out.print(i);
            System.out.print(" + ");
            sum += i;
        }

        System.out.println(" = "+ sum);
    }
}
