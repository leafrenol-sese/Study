package ex4_operator;

public class Ex4_oper {
    public static void main(String[] args) {

        //증감연산자
        //1씩 증가시키거나 1씩 감소시키는 연산자
        //선행증감과 후행증감의 차이를 알고있어야 한다
        int a = 10;
        System.out.println("a : " + ++a);
        //선행은 바로 변경
        int b = 10;
        System.out.println("b : " + b++);
        System.out.println(b);
        //후행은 다음 열의 계산부터 변경

        b++;//11(+1)
        ++b;//13
        --b;//12
        b--;//12(-1)
        --b;//10
        b++;//10(+1)
        --b;//10
        b++;//11
        System.out.println(++b);

    }// main
}
