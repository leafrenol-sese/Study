package ex3_formatter;

public class Ex1_formatter {
    public static void main(String[] args) {
    
    //저의 나이는 20살 입니다
    int age = 20;                    
    System.out.printf("저의 나이는 %d살 입니다\n" , age); 
        //또는
    //저는 20살이고 3층에 살아요
    System.out.printf("저는 %d살이고 %02d층에 살아요\n" , 20 ,3 ); 

    //나는 박씨야
    System.out.printf("나는 %c씨야 \n", '박');

    //나는 a형이야
    System.out.printf("나는 %C형이야\n" , 'a' );

    //원주율 : 3.141592
    System.out.printf("원주율: %.2f\n", 3.141592);


    //저는 홍길동 입니다
    System.out.printf("저는 %s 입니다\n" , "홍길동");

    System.out.printf("%s\t %d\t %d\n" , "김윤" , 100, 95);
    System.out.printf("%s\t %d\t %d\n" , "김길동" , 100, 7);
    
    //오늘 강수량은 15%입니다.
    System.out.printf("오늘 강수량은 %d%%입니다",15);

    }//main

    /*
    formatter의 문법
    \n : 강제개행, 줄바꿈
    %d : 정수 
    %c : 문자
    %C : 뒤의 대입할 소문자를 대문자로 바꾼다
    %f : 실수 (소수점) 
    %.2f : 실수 아래의 두자리 수까지 표시
    %s : 문자열
    \t : Tab, 라인 정리
    \\ : \ 출력
    \" : " 출력
    %% : %특수 문자 (%를 문자열에 입력하고 싶으면 %d'%%'를 입력)
    */

}//class end
