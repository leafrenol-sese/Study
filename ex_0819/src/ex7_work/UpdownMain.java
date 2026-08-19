package ex7_work;

import java.util.Random;
import java.util.Scanner;

public class UpdownMain {
    public static void main(String[] args) {

        //1~50사이의 난수를 발생시키고
        //키보드에서 입력받은 정수를 난수와 비교하기
        //---------------------
        //정수 : 30 (CPU :25) 
        //DOWN
        //정수 : 15
        //UP
        //정수 : 25
        //3회 만에 정답

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 : ");
        int answer = new Random().nextInt(50)+1;
        int num = sc.nextInt();

        UpdownSub ud = new UpdownSub();
        String res = ud.answer(answer,num); 
        
        System.out.printf("%d 회만에 정답" , res);



        
    }//main
}
