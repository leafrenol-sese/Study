package ex1_array;

public class Ex2_array {
    public static void main(String[] args) {
        
        //배열 선언 + 생성 + 초기화
        int [] ar = {1, 2, 3, 4, 5}; //index는 4, 랭스는 5
        
        for( int i = 0; i < ar.length; i++ ){
            System.out.print( ar[i] + " " );
        }//for
      
        System.out.println();
        System.out.println("---------------");

        //개선된 루프 , 향상된 for문
        for( int n : ar ){//java5버전에서 추가, 나중에 많이 사용할 예정이고 공부는 위에 버전으로 사용하자
            System.out.println( n );
            //현재 인덱스 0~4까지의 입력내용 [1(0),2(1),3(2),4(3),5(4)]의 출력이 끝날때까지 반복
            //처음부터 끝까지의 내용을 출력할 때 사용

        }//for

    }//main
}//class end 
