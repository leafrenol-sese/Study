package ex7_work;

import java.util.Random;

public class UpdownSub {

    private int random = new Random().nextInt(50) + 1;
    private int count = 0;
    private boolean result = true;
    
    //정답판별 메서드
    public boolean check(int n) {
        count++; //do-while문이 반복될 때마다 count가 늘어난다

            if (n < random) 
                System.out.println("UP");
            else if (n > random) {
                System.out.println("DOWN");
            } else {
                System.out.println(count + "회 만에 정답");
                result = false;

            } // if

            return result ; //boolean으로 받았기에 'false'로 반환


    }// method

}
