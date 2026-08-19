package ex_work;

//숙제, 주석달기
import java.util.Random;
import java.util.Scanner;

public class Ex1_baseball {
    public static void main(String[] args) {

        //키보드 입력
        Scanner sc = new Scanner(System.in);

        int[] com = new int[3]; // 컴퓨터가 만드는 난수 com[][][]
        int[] user = new int[3]; // 사용자가 입력한 숫자 user[][][]


        // 컴퓨터가 난수를 만드는 과정
        Outer: for (int i = 0; i < com.length;) { // ★ i++은 넣지 않는다
            com[i] = new Random().nextInt(9) + 1; // 경우의 수 3*3 = 9가지가 나와함

            // 중복값 비교 for문
            for (int j = 0; j < i; j++) {

                if (com[i] == com[j])
                    continue Outer; // 반복되면 라벨-Outer:for문으로 이동
                // com[1] == com[0] => com[][A][] == com [A][][] : 같은 출력값이 나오면 label로 이동
                //   i = 0  1  2  
                //  com [o][o][o]
            } // inner

            i++;//★ 컴퓨터가 만든 숫자에 중복값이 없다면 i 증가

        } // outer

        System.out.println("정답 : " + com[0] + com[1] + com[2]); 
        // 컴퓨터가 만든 결과값(본방 게임이라면 안보이게 하고 게임시작)

        //----------------------------------

        // 여기서부터는 중복이 나오지 않는 상태
        
        // 게임룰 만들기
        int cnt = 0; // '몇번만에 맞췄는가; -> while밖에 있어야 초기화되지 않는다

        while (true) {

            cnt++; // while문 몇번 돌렸는지 카운트

            System.out.print("입력(예:1 2 3) : ");
            int number = sc.nextInt(); // user가 키보드 입력

            user[0] = number / 100; // 100의 자리
            user[1] = number / 10 % 10; // 10의 자리
            user[2] = number % 10; // 1의 자리

            // com의 100의 자리가 유저가 입력한 세가지 숫자중 하나에 중복이 있는지 확인
            // 아직 while문 안에 있음
            int strike = 0; // 몇번 카운트 되는지 for문 밖에다 저장
            int ball = 0; // 몇번 카운트 되는지 for문 밖에다 저장
            
            for (int i = 0; i < user.length; i++) { 

                for (int j = 0; j < user.length; j++) {

                    if (i == j) {
                        if (com[i] == user[i])
                            strike++; // 인덱스 값이 같고, 내용값이 같으면 strike
                    } else {
                        if (com[i] == user[j])
                            ball++; // 인덱스 값이 다르고, 내용값이 같으면 ball

                    } // if-else

                } // inner2

            } // outer2

            // -----------------------------

            // 정답처리
            if (strike == 3) { // for문 밖의 카운트된 strike 수가 3개일 때
                System.out.println("정답 !! - " + com[0] + com[1] + com[2]);
                System.out.println(cnt + "회 클리어!"); //for문이 반복된 만큼 cnt가 늘어났음
                break; // while문 종료

            } else {
                if (strike > 0 || ball > 0) { // strike 또는 ball의 수가 0보다 클 때
                    System.out.printf("%d Strake, %d Ball\n", strike, ball);
                } else {
                    System.out.println("OUT!"); // 인덱스도, 데이터도 겹치는 것이 모두 없을 때
                }
            }

            System.out.println("------------------");// while이 끝나지 않아서 이 줄도 반복

        } // while

    }// main
}
