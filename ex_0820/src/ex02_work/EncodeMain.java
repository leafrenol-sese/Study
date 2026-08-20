package ex02_work;

import java.util.Scanner;

public class EncodeMain {
    public static void main(String[] args) {
        
        //입력 : abc123
        //결과 : `~!wer

        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String str = sc.next(); //암호화되기 전의 문자열

        EncodeSub es = new EncodeSub();
        String res = es.encoding(str); //암호화된게 res

        System.out.print("결과 : " + res);

    }//main
}
