package ex6_work;

import java.util.Scanner;

public class Ex7_work {
    public static void main(String[] args) {
        
        //1부터 입력받은 숫자까지 값을 순차적으로 출력하되
        //5의 배수이거나, 1의 자리가 3인 경우는 출력에서 제외
        //---------------
        //입력 : 15
        // 1 
        // 2 
        // 4 
        // 6 
        // 7 
        // 8 
        // 9 
        // 11 
        // 12 
        // 14
        
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int input = sc.nextInt();
      
        for(int i =1; i <= input; i++){
            
            if (i % 5 == 00 || i % 10 == 3) {
                continue;
        }//if

        System.out.println( i ); 
    
    }//for

    }//main
}//class end
