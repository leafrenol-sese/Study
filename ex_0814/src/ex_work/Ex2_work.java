package ex_work;

import java.util.Scanner;

public class Ex2_work {
    public static void main(String[] args) {

        // 이메일 : abc@korea.com
        // 이메일 형식 오류

        // 이메일 : aabbcc@n.com
        // aabbcc님 환영합니다

        Scanner sc = new Scanner(System.in);
        System.out.print("이메일 : ");

        String emall = sc.next();

        // @를 기준으로 이메일 주소를 분할해서 sp 배열에 담는다
        // se[1]='aabbcc' @ sp[1]='n.com'        
        String[] sp = emall.split("@");

        String res = sp[0]; //sp[0]의 아이디만 사용, res에 저장

        if(res.length() < 4 || res.length() > 8){ // 이메일 아이디가 3글자 이하거나 9글자 이상이면 
            System.out.print("이메일 형식이 올바르지 않음");
        
        }else{
            System.out.print(res + "님 환영합니다");
        }

    }// main
}
