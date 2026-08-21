package ex5_static;

public class BankMain {
    public static void main(String[] args) {

        Bank b1 = new Bank("신촌", "02-111-1111");
        Bank b2 = new Bank("강남", "02-222-2222");
        Bank b3 = new Bank("역삼", "02-333-3333");
        
        // ↓ == b1.interest = 0.1f; 
        Bank.interest = 0.1f; //뱅크의 서브에서 이자율에 static 설정, 추후 변경되는 이자율은 static때문에 모든 지점은 같은 메모리를 갖는다
        //b1으로 해도 되지만 권장사항은 클래스 이름으로 지정
        //static은 클래스명. 형식으로 접근 가능

        b1.info();
        b2.info();
        b3.info();

        //  stack   |   heap    |  static   ★스테틱으로 만든 변수는 스테틱에 한개만 갖고, 여러 객체가 같은 값을 같는다
        //__________|___________|____________ 하지만 static은 데이터 메모리를 많이 갖기 때문에 권장하지는 않는다
        //    b1    |  신촌,tel  | 이자율10% -> 0.1%변경
        //    b2    |  강남,tel  | → ↑
        //    b3    |  역삼,tel  | ↗

    }// main
}
