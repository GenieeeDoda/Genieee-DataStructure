package ch01;

import java.util.Scanner;

public class Ch1_2_Q11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int num, i=0;

        do {
            System.out.print("양의 정수 num을 입력하세요 : ");
            num = stdIn.nextInt();
        } while( num < 0);


        while(num > 0) {
            num /= 10;
            i++;
        }

        System.out.println("그 수는 "+i+"자리입니다.");
    }

}
