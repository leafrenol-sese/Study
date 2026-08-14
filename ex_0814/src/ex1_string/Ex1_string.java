package ex1_string;

import java.util.Scanner;

public class Ex1_string {
    public static void main(String[] args) {
        
        //String클래스의 두 가지 특징
        //1) 객체 생성방법이 2가지 (암시적, 명시적)
        //2) 한 번 생성된 문자열의 내용은 변하지 않는다
        
        String s1 = "abc"; //첫글자가 대문자인 클래스를 가지고 변수를 만든다 => 객체 
        String s2 = "abc"; 
        String s3 = new String("abc"); //=>명시적 객체생성
        String s4 = new String("abc");
        //<메모리는 이렇게 저장된다>
        // stack |  heap
        //_______|_________
        //  s1   |  abc -> '내용' 같아 s1과 주소를 공유' => 암시적 객체생성[String 만 할수있다]
        //  s2   | ↗       's1==s2'=> 같은 주소를 공유, '주소가 같다'
        //  s3   |  abc -> 'new'를 사용했기에 새롭게 'abc'가 추가
        //  s4   |  abc ->  몇시적 객체생성은 heap속에 암시,명시적 객체생성과 같은 내용(abc)이 있더라도 새롭게 heap에 데이터가 저장된다

        if( s1 == s3 ){ //'== : 더블이퀄'은 객체간 비교에서는 '주소값' 비교를 한다
            System.out.println("주소가 같습니다");
        }else{
            System.out.println("주소가 다릅니다");
        } //String 끼리는 거의 절대 더블이퀄로 비교하지 않는다



        //String 클래스의 불변의 법칙
        String greet = "안녕";
        greet += "하세요";
        System.out.println(greet); //=>'안녕하세요'로 출력
        //<메모리는 이렇게 저장된다>
        // stack |  heap
        //_______|_________
        // greet |  안녕   :옛날 주소가 되어버려 쓰레기 데이터가 된다(출력 불가)
        //       |   ↓    :원래 가지고 있던 '안녕'이랑 데이터에 '하세요'를 이어 붙여 새로운 주소를 갖게 된다     
        //  +=   | 안녕하세요  :이 이후에 'greet'을 출력하면 '안녕하세요'가 나온다

        

        Scanner sc = new Scanner(System.in);
        System.out.print("연산자 : ");
        String op = sc.next();

        if( op.equals( "+")){ // 'op == "+"' 와 같은 수식은 사용할 수 없다 
        //String에서는 '.equals("비교 내용 : 값 ")'을 사용해야 한다 ★ 
            System.out.println("+ 연산할게요");
        }





    }//main
}
