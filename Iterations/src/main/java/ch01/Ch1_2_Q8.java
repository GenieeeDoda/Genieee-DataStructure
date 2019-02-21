package ch01;

import java.util.Scanner;

// 가우스의 덧셈으로 1부터 n까지의 정수 합을 구하는 프로그 램
public class Ch1_2_Q8 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");

        int n = stdIn.nextInt();

        int sum = (1+n)*n/2;

        System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
    }
}
