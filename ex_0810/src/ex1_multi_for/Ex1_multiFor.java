package ex1_multi_for;

public class Ex1_multiFor {
    public static void main(String[] args) {
        
        // 1 2 3 4 5 
        // 1 2 3 4 5
        // 1 2 3 4 5 
        for ( int i = 1; i <=3; i++){ // i =1 <=2 [참], 안쪽 for문 안으로 {밖의 for문 : 전체 반복할 횟수, y축 : 세로축, 행}

            for( int j = 1; j <=5; j++ ){ // j = 1 <= 3 [참] for문 안으로 {안의 for문 : 출력할 내용, x축 : 가로축, 열}

                System.out.printf("%d ", j); //j=1 안쪽 for문의 증감식이 출력

            }//inner //밖의 for의 i는 사용x

                System.out.println(); // 행 나눔
        }//outer

        System.out.println("-----------------------");

        //5 4 3 2 1
        //5 4 3 2 1
        //5 4 3 2 1

        for ( int i = 1; i <=3 && i >0; i++){ //

            for( int j = 5; j >=1; j--){ 

                System.out.print(j + " "); 

            }//inner 

                System.out.println(); // 행 나눔

        }//outer

    }//main
}//class end
