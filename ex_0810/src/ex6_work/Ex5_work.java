package ex6_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {
        
        //입력받은 두 수의 최소공배수
        //----------------------
        //수1 : 6
        //수2 : 10
        //최소공배수 : 30

        Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int bigNum = sc.nextInt();

        System.out.print("수2 : ");
        int smallNum = sc.nextInt();
        
        for(int i =1 ; i <= bigNum*smallNum; i++){

            if( i % smallNum == 0 && i % bigNum == 0 ){
            System.out.println("최소공배수 : " + i );
            break;
            }//if
            
        }//for

    System.out.println("-----------------------");

        //유클리드 호제법으로 최소 공배수 구하기
        int x = bigNum;
        int y = smallNum;

        while (y !=0) {
            int tmp = x % y;
            x = y;
            y = tmp;
        }//while
        int gcd = x; //x에 저장되었던 최대공약수 값을 gcd로
        //최소공배수
        int lcm = (bigNum*smallNum) / gcd;
        
        System.out.println( "최대공약수 : " + lcm );

        
    }//main
}//class end
