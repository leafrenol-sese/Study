package ex6_work;

import java.util.Scanner;

public class WorkMain {

    public static void main(String[] args) {

        // 정수 : 9
        // 9은(는) 소수가 입니다

        // 정수 : 7
        // 7은(는) 소수가 아닙니다

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int num = sc.nextInt();

        WorkSub ws = new WorkSub();
        boolean res = ws.isPrime(num);

        if (res) // res==true
            System.out.printf("%d 은(는) 소수입니다", num);
        else
            System.out.printf("%d 은(는) 소수가 아닙니다", num);

    }// main

}
