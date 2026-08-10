package ex2_valueType;

public class Ex1_valueType {
    public static void main(String[] args) {
        
    /* 
    자바의 기본 자료형 *반드시 외울것
    논리형 : boolean .... 1bit  -> 참과 거짓만 구분 가능(숫자 불가)
    문자형 : char ....... 2byte
    정수형 : byte ....... 1byte  -> -128 ~ 127  *정수는 오로지 소수점 없는 음양수만 출력
            short ...... 2byte  -> -32768 ~ 32767 
            int ........ 4byte  -> -21억 ~ 21억
            long ....... 8byte  -> -922경 ~ 922경
    실수형 : floot ...... 4.xbyte  *실수는 소수점의 음양수를 출력 
            double ..... 8.xbyte 

            ;=세미클론,마침표 역할
    변수 : 데이터를 저장하는 공간 *용도에 이름표를 붙이기
    자료형 변수명;(선언)
    변수명 = 값; (대입)

    자료형 변수명 = 값;(초기화)

    변수선언 규칙
    1. 숫자로 시작할 수 없다
    2. _를 제외하고 특수 문자를 사용할 수 없다(공백도 사용불가)
    3. 한글로 변수이름 짓지 않는다
    4. 반드시 소문자 알파벳으로 시작하도록 한다

    */        
    // 1. 카멜표기법(Camel Case)
    //    - 첫 단어는 소문자로 시작하고, 다음 단어의 첫 글자를 대문자로 표기하는 방식입니다.
    //    - 예: userName, studentAge, numberOfItems
    //
    // 2. 파스칼 표기법(Pascal Case)
    //    - 모든 단어의 첫 글자를 대문자로 표기하는 방식입니다.
    //    - 주로 클래스명에 사용됩니다.
    //    - 예: UserName, StudentAge, NumberOfItems
    //
    // 3. 헝가리안 표기법(Hungarian Notation)
    //    - 변수의 자료형 또는 목적에 따라 접두어(prefix)를 붙이는 방식입니다.
    //    - 예: strName(문자열), nAge(정수), bChecked(불리언)
    //
    // 4. 스네이크 표기법(Snake Case)
    //    - 단어와 단어 사이를 밑줄(_)로 구분하는 방식입니다.
    //    - 주로 상수명에 사용되며, 모든 문자를 대문자로 표기하기도 합니다.
    //    - 예: user_name, student_age, NUMBER_OF_ITEMS\

        //논리형 : 참과 거짓(true, false)의 두 가지 값만을
        //저장할 수 있는 자료형
        boolean b1; //선언 (b1의 참과 거짓을 구분하겠다 지정)
        b1 = true; //대입
        b1 = false; //위에는 참이였지만 바로 아래에서 거짓으로 변경했기 때문에 출력은 거짓이 나옴
        // b1 = 10; <- 자료형 타입이 올바르지 않기때문에 오류발생  
        System.out.println("b1:"+b1);

        //정수형 : 소수점이 없는 정수값만 저장하는 자료형
        byte b = 127; 
        short s = 32767;
        int n = 5000;
        long lo = 2200000000L; //long을 사용하려면 변수 뒤에 "L or l"을 입력해야 한다.

        System.out.println("b : "+ b);
        System.out.println("s : "+ s);
        System.out.println("n : "+ n);
        System.out.println("lo: "+ lo);
    }   
}
