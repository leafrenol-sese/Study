package ex_work;

import java.util.Scanner;

public class Ex05_work {
    public static void main(String[] args) {
        
        //학생수를 입력하세요 :
        //학생 1의 성적 : 90
        //학생 2의 성적 : 73
        //학생 3의 성적 : 84
        //-----------------
        //평균 성적 : 82.33336
        //---평균 이상인 학생들---
        // => 학생 1 : 90
        // => 학생 2 : 84
        // 평균 이상인 학생의 수 : 2
   
        Scanner sc = new Scanner(System.in);
        System.out.print("학생수를 입력하세요 : ");
        int studentOfNember = sc.nextInt();

        //성적을 입력받아 저장하기 위한 배열
        int [] grade = new int [studentOfNember];// studentOfNenber = grade.leagth 

        int sum = 0; //총점을 저장할 변수
       
            for( int i = 0; i < studentOfNember; i++ ){
                System.out.printf("학생%d의 성적 : " , i+1 ); //i는 현재 0이니 +1 필요
                grade [i] = sc.nextInt();
                sum += grade[i]; //i가 증감할 때마다 출력값을 더한다 명령 
                // for2문 전에는 이미 총합이 계산되어있음
            }//for1

        System.out.println("--------------");

        float average = (float)sum / studentOfNember;
        System.out.printf("평균 성적 : %.2f\n" , average); //\n = 줄바꿈 , printf이기 때문에 문장 끝에 입력함

        System.out.println("----평균 이상인 학생들----");
        int averageCount = 0; //평균을 넘은 학생들의 수를 카운트    

            for(int i = 0; i < studentOfNember; i++ ){
                if ( grade[i] >= average){
                    averageCount++;
                    System.out.printf("=> 학생%d : %d\n" , i+1 , grade[i] );
                }//if
            }//for2
        
        System.out.println("평균 이상인 학생의 수 :" + averageCount);
        
    }//main

}// class end
