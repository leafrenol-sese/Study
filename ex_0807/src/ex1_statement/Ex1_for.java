package ex1_statement;

public class Ex1_for {
    public static void main(String[] args) {

        // for문 : 특정 코드를 원하는 만큼 반복하고자 할 때
        // for( 초기식; 조건식; 증감식; ){
        // 조건식이 참일 때 수행되는 영역
        // }

        int a = 10; // 전역(전체 영역)변수
        // 아래의 for안에 변수를 넣는 것을 '초기화'라고 한다
        for (int i = 0; i <= 2; i++) { // int=i는 for문에서만 사용가능한 지역변수

            System.out.println(i);

        } // for
        System.out.println("----------------------");

        // 10~`까지 반복하는 for문

        for (int i = 10; i >= 1; i--) { // 위에도 i를 사용했지만 지역변수이기 때문에 다시 이용할 수 있다

            System.out.println(i);

        } // for

        System.out.println("----------------------");

        // 1~100까지 반복하는 for문을 만들되
        // 5의 배수만 출력

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }

        } // for

        System.out.println("----------------------");

        for (int i = 5; i <= 100; i += 5) {

            System.out.println(i);
        } // for

    }// main

}// class end
