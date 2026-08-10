package ex4_operator;

public class Ex2_oper {
    public static void main(String[] args) {
        
        //대입연산자
        //특정 값을 변수에 전달하여 기억시킬 때 사용하는 연산자
        int n1 = 10; //'='->대입연산자
        int n2 = 7; 
        n2 += n1; // => n2 = n2 + n1 *10+7=17, n2가 7에서 '17'로 덮어 씌워져 출력된다
        System.out.println("n2 : " + n2);

        n2 -= 2; // n2 = n2-2; 현재 n2는 17이기 때문에 '15'로 출력
        System.out.println("n2 : " + n2);

        n1 *= n1; // n1 = n1 * n1; 현재 n1은 10이기 때문에 '100'로 출력
        System.out.println("n1 : " + n1);

        n1 /= 5; // n1 = n1 / 5; 현재 n1은 100이기 때문에 100나누기5, 몫'20'로 출력
        System.out.println("n1 : " + n1); 

        n1 %= 3; //  n1 = n1 % 3; 현재 n1은 20이기 때문에 20나누기3, 나머지 '2'로 출력
        System.out.println("n1 : "+ n1);

        //비교연산자
        //변수나 상수의 값을 비교하여 결과를 만드는 연산자
        int i1 = 10;
        int i2 = 20;
        boolean res = i1 <= i2; //부등호에 따라서 참 거짓만 출력한다 , 부등호 후 이퀄을 써야한다
        System.out.println("res : "+ res);

        res = i1 == i2; // '=='이 수학적으로 같다는 뜻 * i1은 10, i2는 20 이므로 거짓이다 
        System.out.println("res : " +res); 

        res = i1 != i2; // '!'은 'NOT'이란 뜻 *i1은 10, i2는 20 이므로 참이다
        System.out.println("res : " +res);

        // < = lt : 작다 , > = gt : 크다
        



    }
}
