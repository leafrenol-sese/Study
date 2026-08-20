package ex_work;

import java.util.Scanner;

public class Ex4_work {
    public static void main(String[] args) {

        // 키보드에서 입력받은 ox값을 계산하여 출력하기
        // ---------------------
        // 입력 : ooxxo
        // 결과 : 4

        Scanner sc = new Scanner(System.in);

        System.out.print("입력 : ");
        String qu = sc.next(); 
        
        // "ooxo" => [o][o][x][o]
        //i = 0  1  2  3 
        //   [o][o][x][o] 
        // i=0[o],cnt=1,sum= 1 =>
        // i=1[o],cnt=2,sum=(1+2=)3 =>
        // i=2[x],cnt=0,sum= 3 =>
        // i=3[o],cnt=1,sum=(3+1)=4 
        // <for문 종료> => syso(결과 : sum(1+2+1)=4)

        int cnt = 0; // o가 나온 수
        int sum = 0; // cnt 총 합 

        for (int i = 0; i < qu.length(); i++) {

            if (qu.charAt(i) == 'o') {
                cnt++;
            } else {
                cnt = 0;//'x'가 나오는 경우, cnt를 0으로 만들어서 리셋시킨다 
            }
            sum += cnt;

        } // for

        System.out.print("결과 : " + sum);

    }// main
}
