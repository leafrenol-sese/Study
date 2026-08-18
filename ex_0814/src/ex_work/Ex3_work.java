package ex_work;

import java.util.Scanner;

public class Ex3_work {
    public static void main(String[] args) {

        // 키보드에서 아무값이나 입력받는다
        // 입력받은 문자열에 소문자 a의 갯수를 출력
        // ----------------
        // 입력 : aqwfiqopuwahifnjaks
        // a의 갯수 : 2

        Scanner sc = new Scanner(System.in);
        int cnt = 0; // a 카운트 저장

        System.out.print("입력 : ");
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) { // 인덱스 갯수(=str.length())중에서

            if (str.charAt(i) == 'a') // 그 안의 문자가 a일 때, cnt가 증가
                cnt++;

        } // for

        System.out.print("a의 갯수 : " + cnt);

    }// main
}
