package ex6_work;

import java.util.Scanner;

public class Ex4_work {
public static void main(String[] args) {

    //키보드에서 입력받은 두 개의 수의 최대공약수 출력
    //---------------------
    //수1 : 18
    //수 : 12
    //최대공약수 : 6
    
    Scanner sc = new Scanner(System.in);
        System.out.print("수1 : ");
        int bigNum = sc.nextInt();

        System.out.print("수2 : ");
        int smallNum = sc.nextInt();
   
        if( bigNum < smallNum ){
            int i = bigNum;
            bigNum = smallNum;
            smallNum = i;
        }//if
        
        int i = smallNum;

        for(; i >= 1; i--){
        if(smallNum % i == 0 && bigNum % i == 0 )
            break;
        }//for
    System.out.println("최대공약수 : " + i );

    System.out.println("-----------------------");

        //유클리드 호제법으로 최대공약수 구하기
        while (smallNum !=0) {
            
            int tmp = bigNum % smallNum;
            bigNum = smallNum;
            smallNum = tmp;
        }//while
        System.out.println( "최대공약수 : " + bigNum );

    }//main
}//class end
