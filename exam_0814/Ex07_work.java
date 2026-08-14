package ex2_work;

import java.util.Scanner;

public class Ex07_work {
    public static void main(String[] args) {

        // 홀수 : 3
        // 08 01 06
        // 03 05 07
        // 04 09 02

        // n행 n열 마방진을 만들어라

        Scanner sc = new Scanner(System.in);

        System.out.print("홀수 : ");
        int size = sc.nextInt();
        int[][] square = new int[size][size];
        int num = 1; // 마방진에 들어갈 시작수

        int y = 0; // y축 관리(열)
        int x = 0; // x축 관리(행)

        x = size / 2; // 가장 먼저 시작 어떤 수를 넣어도 중앙부터 시작 

        while (num <= size * size) { // y=0 x=1[참]

            square[y][x] = num; // [y=0 x=1]->1이 들어간다 ->if문들 확인 시작
            //[][1][]
            //[][][]
            //[][][]
            if (num % size == 0) { // 1/3 !=0 거짓으로 else시작)
                y++;
            } else {
                y--; // -1
                x++; // 2
            }//if-else

            if (y < 0)  // 참, y = 3 - 1 => y=2
                y = size - 1;
            
            if (x >= size) 
                x = 0;

            num++; // num=2 로 증가 ~> while 아래 square[y][x] => square[y][x]

        } // while

        //마방진 출력
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                System.out.printf("%02d  ", square[i][j]);

            } // inner3

            System.out.println();

        } // outer

    }// main
}
