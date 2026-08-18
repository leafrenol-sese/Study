package ex1_method;

public class MethodTest {

    public void test1() {
        System.out.println("test1 메서드 호출");
    }

    public int test2( int n ){ //test2를 호출하고 싶으면 'n'을 사용해야한다 라고 지정됨
        n += 100; // n=100+100 => 현재 n은 200
        System.out.println("결과 : " + n);

        //나를 호출한 곳으로 return값을 딱 한개만 가지고 돌아간다.
       
        //int su = 100 => n++였다면 => 101로 출력

        return n;  
        //return 밑의 코드들은 출력되지 않는다
        
        // public 'void' 가 아닌,  public 'String' 문자열은 'return'되는 타입도 문자열이여야 한다 

    }



}
