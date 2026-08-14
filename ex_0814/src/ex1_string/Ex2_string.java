package ex1_string;

public class Ex2_string {
    public static void main(String[] args) {
        
        String str = "Hong Gil Dong"; //암시적 객체 생성

        int index = str.length(); //length뒤 (소괄호)를 '메서드' 라고 한다 //메서드는 해당 객체의 내용을 비교한다
        //아래에 활용되고 있는 'index'는 int로 되어있다

         //문자열의 길이
        //Hong_Gil_Dong
        //[H][o][n][g][_][G][i][l][_][D] [o] [n] [g] 자리수는 14
        //[0][1][2][3][4][5][6][7][8][9][10][11][12] 인덱스는 0 ~ 13

        System.out.println("str의 길이 : " + index); // 'str' = 'Hong Gil Dong' => '13'개의 글자

        index = str.indexOf('G');
        System.out.println("맨 처음 문자 G의 위치 : " + index); // => '5'가 출력

        index = str.indexOf("Gil");
        System.out.println("문자열 Gil의 위치 : " +index ); //=> '5'가 출력
        
        index = str.lastIndexOf('o');
        System.out.println("마지막 문자 o의 위치 : " + index); //Hong안의 o가 아닌, Dong안의 'o'가 출력

        char res = str.charAt(6);
        System.out.println("6번째 문자 : " + res); //=>'i'가 출력

        String ss= str.substring(1,6); //1~6사이의 문자열이 출력 : ong_G
        System.out.println("잘라낸 문장 : " + ss);



        String apple = "Apple"; //암시적 객체
        if( apple.equals("apple") )
            System.out.println("사과"); 
        // 문장 해석
        // 객체 apple 안의 'Apple'이 anObject:'apple'의 주소값이 같다면 '사과'를 출력하라
        // Apple != apple 대소문자도 인식하기 때문에 출력하지 못한다.
        
        if( apple.equalsIgnoreCase("apple"))
            System.out.println("대소문 상관없이 사과"); // =>출력 가능

        
        String password = "       1234        "; 
        //'trim' : 앞, 뒤의 쓸때없는 공백을 지운다(단, 문장 사이의 공백은 못지운다)
        String pwd2 = password.trim(); 
        System.out.println(pwd2 + "의 길이 : " + pwd2.length());
    
        //문자열로 작성된 숫자형태의 데이터를 실제 숫자로 바꿔주는 메서드
        String number = "100"; // 현재 '100'은 문자열 상태
        int num = Integer.parseInt(number); // 문자로 된 100을 숫자 100으로 변경, int num = 100 이 가능해졌다
        System.out.println( num + 1); //출력하면 100+1 ; 일반 숫자 계산식이 되어버린다


        //기본자료형의 Wrapper 클래스
        // boolean -> Boolean
        // char -> Character
        // byte -> Byte
        // short -> Short
        // int -> Integer
        // long -> Long
        // float -> Float
        // double -> Double


    }//main
}
