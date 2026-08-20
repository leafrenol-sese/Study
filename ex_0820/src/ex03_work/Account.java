package ex03_work;

import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        
        /*
        1. 입   금
        2. 출   금
        3. 잔액확인
        ect.종  료 
        >> 1
        ---입   금---
        입금액 : 1000
        입금성공
        -------------
        1. 입   금
        2. 출   금
        3. 잔액확인
        ect.종  료 
        >> 3
        ---잔액확인---
        1000원
        -------------
        1. 입   금
        2. 출   금
        3. 잔액확인
        ect.종  료 
        >> 4
        atm 사용을 종료합니다
        */

        Scanner sc = new Scanner(System.in);
        Atm atm = new Atm(); //유저가 private money 조작을 위한 코드

        while ( true ) {
            System.out.printf("1. 입   금\n2. 출   금\n3. 잔액확인\nect. 종  료\n");
            System.out.print(">> ");

            int select = sc. nextInt();
            int money = 0;
           
            switch (select) {
                case 1 :
                    System.out.println("---입   금---");
                    System.out.print("입금 : ");
                    money = sc.nextInt();
                    atm.deposit(money);
                    break;
                case 2 :
                    System.out.println("---출   금---");
                    System.out.print("출금액 : ");
                    money = sc.nextInt();
                    atm.withdraw(money);
                    break;
                case 3 :
                    System.out.println("---잔액확인---");
                    atm.balance(); //입력할 값이 없으니 공백
                    break;
                default : 
                    System.out.println("atm 사용을 종료합니다");
                    return;//break-label도 가능하지만, 아무 전달값 없는 return도 사용할 수 있다
            }//swicth

            System.out.println("------------------");

            
        }//while
        




    }
}
