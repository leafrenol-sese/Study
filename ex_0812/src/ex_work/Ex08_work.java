package ex_work;

import java.util.Random;

public class Ex08_work {
    public static void main(String[] args) {
       
        //변수 money에서 10~5000사이의 난수를 발생시킨다
        //단 발생한 난수 money는 1의 자리가 반드시 0이 되되록 한다
        //money를 최소한의 동전으로 몇 개씩 거슬러 지는지 출력
        //-----------------------------
        //금액 : 2590
        //500원 : 5
        //50원 : 1
        //10원 : 4

        int [] coin = {500, 100, 50, 10};

        int money = new Random().nextInt( 500 ) + 1;
        money *= 10; //1의 자리를 0으로 만든다

        System.out.println("금액 : " + money);

        for(int i = 0; i < coin.length; i++){ //coin.length 는 4

            int res = money / coin[i]; // 940원, i=0->500, 940/500의 몫은 1, res는 1이 된다.

            if(res > 0){ //1 > 0 [참]
                System.out.printf("%d원 : %d개\n" , coin[i] , res); // 500원, 1개 출력. 

                money %= coin[i]; //940%500 = 440, money값이 440으로 변경 
                // 맨위의for문속 int i = 1로 증가, res =440, coin[1] = 100
                // 440원, i=1-> 100, 440/100의 몫은 4, res는 4 -> 100원, 4개 출력 
                // money는 440%/100 하여 나머지 40으로 변경
                
                // 맨위의for문속 ini i = 2로 증가 , 바로 아래의 int res~ 이동, 4 
                // coin [2] -> 50  => 0.08로 [felse] if문이 작동되지 않고 맨위의 for문 i는 3이 된다(이때, res와 money값은 변경되지 않는다)
                // int res(4) = 40(money) / 10(coin[3]), 
                // 다음의 if문이 참, 40원은 4개 로 출력, 나머지는 0, 모든 코드가 끝난다




            }//if

        }//for






    }//main
}//class end
