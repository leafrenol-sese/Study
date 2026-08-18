package ex_work;

import java.util.Scanner;

public class Ex5_work {
    public static void main(String[] args) {
        
        //문장 : HelloWorld
        //결과 : Hlool (홀수들의 값들만 출력)

        Scanner sc = new Scanner(System.in);
        System.out.print("문장 : ");
        String in = sc.next();

        String res = ""; 

        for(int i = 0; i < in.length(); i+=2){
            //                         ↑홀수만 
            res += in.charAt(i); // i가 홀수일 때, res에 i가 홀수값일 때의 출력값을 누적시킬 것이다

            //i=0,in=H,res=H
            //i=2,in=l,res=Hl
            //i=4,in=o,res=Hlo
            //i=6,in=o,res=Hloo
            //i=8,in=l,res=Hlool
            //i=10 -> for문 x => syso(res), 'Hlool' 출력
            
        }
        System.out.println(res);

    }//mein
}
