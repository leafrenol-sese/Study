package ex_work;

import java.util.Scanner;

public class Ex1_work {
    public static void main(String[] args) {

        // 키보드에서 입력받은 값이 회문인지 판단 *회문:앞으로 읽으나, 뒤에서 읽어도 같은 문장 ex) 토마토, 기러기
        // -------------------
        // 입력 : abcba
        // abcba 은(는) 회문입니다.

        // 입력 : abc
        // abc 은(는) 회문이 아닙니다.

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");

        // 원본
        String str = sc.next();

        StringBuffer sb = new StringBuffer(str);
        
        // 원본을 뒤집어서 저장할 객체
        String rev = sb.reverse().toString(); //원본을 뒤집는 명령문

        // <이렇게도 할 수가 있다>
        // for(int i = str.length()-1; i >= 0; i--){ //여기가 메인
        // 원본과 원본을 뒤집은 객체가 같다면 회문
        // rev += str.charAt(i);

        // }//for

        // str = "abc"
        // rev = "cba"
        // i = 0
        if (str.equals(rev)) { // str == rev 절대 하지말라!
            System.out.println(str + "은(는) 회문이다");
        } else {
            System.out.println(str + "은(는) 회문이 아니다");
        }

    }// main
}
