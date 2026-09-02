package game;

import java.lang.reflect.Array;
import java.util.Random;

public class Seutda {
    public static void main(String[] args) {

        Random rd = new Random();
        int num = new Random().nextInt(10 - 1) + 1;

        int rdNum1 = rd.nextInt(10) + 1; // 1 ~ 10 첫 패
        int rdNum2 = rd.nextInt(10) + 1; // 1 ~ 10 두번째 패

        int sum = (rdNum1 + rdNum2) % 10;

        System.out.println("첫번째 패: " + rdNum1);
        System.out.println("두번째 패: " + rdNum2);

        while (true) {

            if ((rdNum1 == 3 && rdNum2 == 8) || (rdNum1 == 8 && rdNum2 == 3)) {
                System.out.println(" 삼팔광땡 : " + sum);

                if ((rdNum1 == 3 && rdNum2 == 1) || (rdNum1 == 1 && rdNum2 == 3)
                        || (rdNum1 == 1 && rdNum2 == 8) || (rdNum1 == 8 && rdNum2 == 1))
                    System.out.println("광땡 :" + sum);

                if (rdNum1 == 10 && rdNum2 == 10)
                    System.out.println("장땡 :" + sum);

                if (rdNum1 == 9 && rdNum2 == 9)
                    System.out.println("구땡 :" + sum);

                if (rdNum1 == 8 && rdNum2 == 8)
                    System.out.println("팔땡 :" + sum);

                if (rdNum1 == 7 && rdNum2 == 7)
                    System.out.println("칠땡 :" + sum);

                if (rdNum1 == 6 && rdNum2 == 6)
                    System.out.println("육땡 :" + sum);

                if (rdNum1 == 5 && rdNum2 == 5)
                    System.out.println("오땡 :" + sum);

                if (rdNum1 == 4 && rdNum2 == 4)
                    System.out.println("사땡 :" + sum);

                if (rdNum1 == 3 && rdNum2 == 3)
                    System.out.println("삼땡 :" + sum);

                if (rdNum1 == 2 && rdNum2 == 2)
                    System.out.println("이땡 :" + sum);

                if (rdNum1 == 1 && rdNum2 == 1)
                    System.out.println("삥땡 :" + sum);

                break;
            }
        }

    }// main

}
