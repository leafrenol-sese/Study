package ex4_operator;

public class Ex3_oper {
    public static void main(String[] args) {
        
        //논리연산자
        //비교연산자를 통한 연산이 2개 이상일때 연결해주는 연산자
        int age = 30;
        int limit = 35;
        // '&&' : and연산자
        // 앞쪽 연산이 거짓이면 뒤쪽 연산을 수행하지 않는다
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false 
        boolean res = ( limit - age ) > 5 && (age += 2) > 30;
        // 35-30=5(거짓)&&(age(30)+=2 == 32)>2 *왼쪽이 이미 거짓으로 판명되었기에 
        // 뒤의 연산을 실행하지 않는다. 따라서 값은 '32'이 아닌 '30'이 나온다
        System.out.println("&&연산 : "+ res); 
        System.out.println("age :" + age); 

        // ||(or)연산자
        int i1 = 10;
        int i2 = 20;
        // or연산은 앞쪽 연산이 참이면 뒤쪽 연산을 수행하지 않는다
        // false || false = false
        // false || true = true
        // true || true = true
        // true || false = true 
        res = (i1 += 10) > 20 || i2 -10 == 11; 
        // res = (10+10=20)[거짓] > 20 or 20-10 == 11[거짓] *앞뒤 모두 거짓임으로 '거짓' , 
        // 둘중 하나가 참이라면 '참'
        System.out.println("||연산 : " + res);
        // 만일, res = (i1 += 10) > 20 || i2 -9 == 11; 의 경우, 앞은 '거짓'이나 
        // 뒤가 '참'이므로 결과값은 '참'

        //!(not)연산자
        //참을 거짓으로, 거짓을 참으로 변경하는 연산자
        System.out.println("!연산 : " +!res); // true로 출력(이때만)
        System.out.println(res); //다시 원래의 false로 돌아옴
        
        res = !res; //false -> true로 변화
        System.out.println(res); //true로 풀력

    }//main
}//class end
