package ex1_constructor;

public class ConMain {
    public static void main(String[] args) {
        
        //생성자:
        //객체가 생성될 때 메모리 할당을 위해 딱 한번 반드시 호출되는 것
        //생성자는 반환자가 없다(void, String, int 등등)
        
        //ConSub sc = new ConSub(); // <- new ConSub(); 가 생성자
        //cs.ConSuB(); [사용불가X] 위에 한번 호출된 이후 사용될 수 없다

        ConSub[] cs = new ConSub[2];

        cs[0] = new ConSub();
        cs[1] = new ConSub();


    }//main
}
