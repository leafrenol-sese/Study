package ex4_continue;

public class Ex1_continue {
    public static void main(String[] args) {
        
        //continue문 : 
        //반복문 내에서 특정 코드를 건너뛰고자 할 때
        
        for( int i = 1; i <= 2; i++ ){

            for( int j = 1; j <= 5; ){

                if( j % 2 == 0){ 
                    //for문안에서 continue를 만나면
                    //가까운 for문의 증감식으로 넘어간다
                    //for문에 증감식이 없다면 조건식으로 간다
                    
                                //2의 배수 2, 4 , 가까운 배열의 증감식으로 이동, j++로 이동된다
                    continue; //break와 같이 아래에는 아무것도 넣지 못한다 //참이면 continue가 인식된다 
                              // 아래의 syso(j + " ")가 출력

                }//if
                System.out.print( j + " " );
                

            }//inner

            System.out.println();

        }//outer

    }//main
}//class end
