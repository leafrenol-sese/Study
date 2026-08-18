package ex2_method;

public class TestMain {
    public static void main(String[] args) {
        
        Test t1 = new Test();
        String res = t1.average(100, 80, 70);
    //만일 public void average 라면 void이기때문에 앞에 '='은 사용할 수 없다 
    // ex) int res = t1.average (X)

        System.out.println("결과 : " + res); //return된 값을 출력



    }//main
}
