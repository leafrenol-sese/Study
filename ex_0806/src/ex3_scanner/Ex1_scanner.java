package ex3_scanner;

import java.util.Scanner;

public class Ex1_scanner {
    public static void main(String[] args) {
        
        //키보드에서 값을 받기 위한 Scanner객체
        Scanner sc = new Scanner( System.in );
        
        System.out.print("정수 : "); //ln(=엔터,행나눔)을 없에면 스캐너가 바로 옆으로 옮겨진다 
        int n = sc.nextInt();
        System.out.println("값 : " + n);

        System.out.println("문자열 : ");
        String s = sc.next();
        System.out.println("값 : " + s);

    }//main
}//class end
