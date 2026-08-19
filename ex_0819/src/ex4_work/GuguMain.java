package ex4_work;

import java.util.Scanner;

public class GuguMain {
    public static void main(String[] args) {
        
        //단 : 5
        //5단
        //5 x 1 = 5
        //....
        //5 x 9 = 45

        Scanner sc = new Scanner(System.in);
        System.out.print("단 : ");
        int dan = sc.nextInt();

        Gugudan ggd = new Gugudan(); //서브의 Gugudan.java를 불러오기, ggd=Gugudan.java => printGugu함수에 (dan)을 파라미터함
        ggd.printGugu(dan);

    
     

    }//main
}
