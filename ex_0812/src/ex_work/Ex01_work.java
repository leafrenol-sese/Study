package ex_work;

import java.util.Scanner;

public class Ex01_work {
    public static void main(String[] args) {
        
        //입력 : 5
        // A B C D E

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int n = sc.nextInt();

        char[] arr = new char[n];
        
        for( int i = 0; i < n; i++ ){ // n = arr.length 와도 같다
            
            arr[i] = (char)('A'+i); 
            //아스킥코드에서 A=65, i++ : i가 증가할수록 뒤의 i도 같이 증가 되므로 65, 66, 67, 68, 69 로 출력된다 
          System.out.print( arr[i] );
     
        }//for

        System.out.println();
        System.out.println("------------------");

        char [] cArr = new char[n];
        char ch = 'A';

        for(int i = 0; i < n; i++){
            System.out.print( cArr[i] = ch++ );

        }//for

    }//main
}//class end
