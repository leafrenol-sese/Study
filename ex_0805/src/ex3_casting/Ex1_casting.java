package ex3_casting;

public class Ex1_casting {
    public static void main(String[] args) {
        //casting(형변환)
        //1. 프로모션 
        // - 큰 자료형에 작은 자료형을 대입하는 것(자동)
        double d1 = 100.5; //8byte
        int n1 = 200; //4byte *double이 int보다 용량이 큼  
        d1 = n1; //대입
        System.out.println("d1 : "+ d1);  //int인데 자동으로 double의 소수점으로 변경되는걸 캐스팅이라 한다

        int n2 = 100; //4byte 
        char ch = 'A'; //2byte 
        n2 = ch; //*A를 아스키코드 계산 65, 100이라는 숫자는 65로 덮어씌워진다
        System.out.println("n2 : "+ n2); //'A'는 숫자 65, 출력값은 65

    }
}
