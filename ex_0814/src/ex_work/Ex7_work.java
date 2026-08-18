package ex_work;

import java.util.Scanner;

public class Ex7_work {
    public static void main(String[] args) {
        
        //키보드에서 아무값이나 입력받고
        //숫자인지 아닌지를 판단하기
        //-----------------------
        //값 : 123
        //123은(는) 숫자입니까? : true

        //값 : a12
        //a12은(는) 숫자입니까? : false

        Scanner sc = new Scanner(System.in);
        System.out.print("값 : ");
        String str = sc.next();

        // str = "a10"
        // i=0, ch='a' => if문 : 아스키코드'a'는 '97' -> if문 실행해 break를 만남 -> for문 밖, 아래의 if문으로 진행
        // if(i=0, str.length=3) -> 0!=3 이기 때문에 else의 "숫자가 아님"이 출력
        

        int i = 0; //전역변수

        for(; i < str.length(); i++ ){
            
            char ch = str.charAt(i);
            
            if( ch < '0' || ch > '9' ) // 아스키코드 사용
                break;
        }//for

        if( i == str.length() ){ //밖의 전역변수를 빼두어서 
            System.out.println( str + "은(는) 숫자입니다");
        }else{
            System.out.println( str + "은(는) 숫자가 아님");
        }


    }//main
}
