package ex3_break;

public class Ex1_break {
    public static void main(String[] args) {
        
        //break문 : 반복문 내에서 강제적으로
        //가장 가까운 반복문을 빠져나갈 때 사용

        for( int i = 1; i <=3; i++ ){

            for( int j =1; j <=10; j++ ){

                if( j % 2 == 0 ){
                    break;//가까운 반복문 : 안쪽 for문 나와서 syso을 만나, 다음 행으로, 맨 위의 i++부터 다시 시작
                          //break 아래의  'syso(j = " ")'코드는 무시된다
                }//if  

                System.out.print(j + " "); //브레이크가 안된다면 출력되는 코드

            }//inner

            System.out.println();

        }//outer

    }//main
}//class end
