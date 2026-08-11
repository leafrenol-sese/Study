package ex1_statement;

public class Ex2_for {
    public static void main(String[] args) {
        
    //1~10 정수들 중에서 홀수의 합만 계산하여 출력
    //--------------------
    //결과 : 25

    int sum = 0;
    for( int i = 1; i <= 10; i ++){
        if( i % 2 == 1 ){
            sum += i; // 1, 3, 5, 7, 9 일때만 i값이 변경 -> 변경된 숫자들의 덧셈으로 연산됨
            }//if
        }//for
    
        System.out.println("결과 : " + sum);    

    }//main
}//class end
