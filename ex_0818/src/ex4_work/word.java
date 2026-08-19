package ex4_work;

import java.util.Scanner;

public class word {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");

        // 원본
        String str = sc.next();

        CheckWord cw = new CheckWord(); //이 코드가 있어서 서브의 메소드를 불러올 수 있다
        String rev = cw.check( str ); //서브의 메소드


        if (str.equals(rev)) { // str == rev 절대 하지말라!
            System.out.println(str + "은(는) 회문이다");
        } else {
            System.out.println(str + "은(는) 회문이 아니다");
        }

    }//main
}
