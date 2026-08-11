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
    int su1 = sc.nextInt();
    System.out.print("수2 : ");
    int su2 = sc.nextInt();

    int m = 0;
    int n = 0;
   
    for(int i = 1; i < su1; i++){
            
        for(int j = 1; j <su2; j++){
            if(j % i != 0){
                j = n;
            }else(i % j != 0){
                i = m;
            }//if
        }//inner

        System.out.print("최대공약수 : " + (m*n) );

    }//outer

    


    }//main
}//class end
