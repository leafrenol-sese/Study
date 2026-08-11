package ex_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {
        
    //정수 n1, n2를 입력받고
    //n1~n2사이의 합을 출력
    //--------------------
    //수1 : 2
    //수2 : 5
    //결과 : 14

    Scanner sc = new Scanner(System.in);
   
    System.out.print("수1 : ");
    int n1 = sc.nextInt();
    
    System.out.print("수2 : ");
    int n2 = sc.nextInt();  
    
    int res = 0; //결과 출력용 변수
        //n1과 n2의 값을 교환 
        if( n1 > n2 ){ // 5 > 2[참] if문 안으로 들어감 //스왑, 수식외울것!
            int n3 = n1; // n3 = 5
            n1 = n2; // n1 = 2 
            n2 = n3; // n2 = 5
        }
        for(int i = n1; i <= n2; i++){
         res += i;   
               
        }//for
    System.out.print("결과 : " + res );

    }//main
}//class end
