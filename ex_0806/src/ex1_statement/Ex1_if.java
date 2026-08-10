package ex1_statement;

public class Ex1_if {
    public static void main(String[] args) {
        
        //제어문 - 프로그램의 흐름을 제어하는 문장
        //분기문과 반복문으로 나뉜다
        //분기문 : if, switch
        //반복문 : for, while, do-while
        
        //if문
        //if( 조건식 ){
        // 조건식이 참일 때 실행되는 영역
        //}

        int n = 50;  // 변수 n에 50을 저장

        // String은 쌍따옴표("") 안에 여러 글짜(문자열)를 저장하기 위한 자료형
        String str = "안녕하세요";  // 변수 str에 "안녕하세요" 문자열 저장

        // n이 49와 같으면 str의 값을 "n은 50입니다"로 변경
        if( n == 49 ){
            str = "n은 50입니다";
        }
        // if문 조건(n == 49)이 거짓(false)이므로 실행되지 않음
        // 따라서 위 if문은 실행되지 않아 str은 여전히 "안녕하세요"임

        // n이 50이 아니라면 str의 값을 "n은 50이 아닙니다"로 변경
        if( n != 50 ){
            str = "n은 50이 아닙니다";
        }
        // if문 조건(n != 50)이 거짓(false)이므로 실행되지 않음
        // str의 값은 변경되지 않고 "안녕하세요"가 남음

        // 최종적으로 str에 저장된 문자열을 출력
        System.out.println(str);  // 결과: "안녕하세요"가 출력됨

    }//main
}//class end
