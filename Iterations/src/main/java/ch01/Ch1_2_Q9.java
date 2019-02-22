package ch01;
import java.util.Scanner;

// 정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하는 프로그램
public class Ch1_2_Q9 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수 a, b를 입력하세요 : ");
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();

        int result = sumof(a,b);

        System.out.println("두 정수 " +a+" , "+b+" 의 합은 " + result);
    }

    static int sumof(int a, int b) {
        int sum = 0;

        for(int i=a; i<=b;i++) {
            sum += i;
        }

        return sum;
    }
}
