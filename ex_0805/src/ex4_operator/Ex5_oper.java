package ex4_operator;

public class Ex5_oper {
    public static void main(String[] args) {
        
    //삼항(조건)연산자
    //하나의 조건식을 총해 발생하는 경과를 원하는 타입으로
    //변환할 수 있도록 하는 연산자
    int a = 10;
    int b = 15;
    int res = ++a >= b ? 100 : 200; // ? [참일때] : [거짓때] 
    // 11 >= 15 [거짓] -> 100(참) : 200(거짓) 따라서 '200'이 출력
    // ? 뒤의 값의 타입이 같아야 한다(문자면 문자끼리, 숫자면 숫자끼리)
    System.out.println("res : " +res);

    int n1 = 10;
    int n2 = 20;
    float res2 = (n1 += n1) == n2 ? 3.14f : 5.19f; 
    //더블을 사용해도되지만 플롯을 사용한다면 출력값의 뒤에 f(orF)를 입력해야한다
    //(10+10)==20 [참] ? [참: 3.14] : [거짓: 5.19]
    System.out.println("res2 : "+res2); // '3.14' 출력
    
    a = 10;
    b = 12; 
    char res3 = ++a >= b || (a-8) + 7 <= b && 13 - b > 0 && (a += b) - (a%b) > 10? 'O' : 'X';
    // 11 >= 12 [f] or ([++a 때문에]11-8) +7 <= 12 [t] [전체TURE] 
    // and 13-12 > 0 [t] and (11+12=23) - ([앞의 단계 때문에 a=23]12/23=11) => 23-11=12 > 10[t] [전체 TRUE] ? 
    // 문자이기 때문에 'char'사용, 출력값[O]

    System.out.println("res3 : " + res3);


    }//main
}//class end 
