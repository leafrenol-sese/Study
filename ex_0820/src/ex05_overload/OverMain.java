package ex05_overload;

public class OverMain {
    public static void main(String[] args) {
    
        OverSub os = new OverSub();
        os.result(); //인자가 없는 메서드
        os.result(100); //정수를 인자로 받는 메서드
        os.result( 'A'); //문자를 인자로 받는 메서드
        os.result("a"); //문자열을 인자로 받는 메서드
        os.result(1, "a"); //정수, 문자열을 인자로 받는 메서드
        os.result("a", 100); //문자열, 정수를 인자로 받는 메서드

        

    }//main
}
