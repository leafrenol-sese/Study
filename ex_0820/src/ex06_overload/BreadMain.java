package ex06_overload;

import java.util.Scanner;

public class BreadMain {
    public static void main(String[] args) {
        
        //빵을 만들었습니다 <--메서드1 호출
        //----------------------
        //빵을 만들었습니다 
        //빵을 만들었습니다 
        //요청하신 2개의 빵을 만들었습니다 <--메서드2호출
        //----------------------
        //크림빵을 만들었습니다
        //크림빵을 만들었습니다
        //요청하신 2개의 크림빵을 만들었습니다 <--메서드3호출
        
        //빵의 종류
        //빵의 갯수
        


        Bread bread = new Bread();

        bread.makeBread();
        System.out.println("------------------");

        bread.makeBread(2);
        System.out.println("------------------");

        bread.makeBread("팥빵", 3);

    }//main
}
