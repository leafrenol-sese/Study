package ex7_work;

import java.util.Scanner;

public class UpdownSub {

    Scanner sc = new Scanner(System.in);
    num = sc.nextInt(); 
    public String answer(int answer, int num){
        int cnt = 0;
        while ( num != answer) {
            cnt++;
            System.out.print( "숫자 : " );
            
            if(num < answer){
                return "UP";
            }else if( num > answer){
                return "DOWN";
            }else{
                return ""+cnt;// + "회 만에 정답";
            }//if

            }//while

    }//method

}
