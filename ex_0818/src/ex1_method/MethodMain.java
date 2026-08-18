package ex1_method;

public class MethodMain {
    public static void main(String[] args) {
        
        MethodTest m1 = new MethodTest(); 
        m1.test1(); //=System.out.println("test1 메서드 호출");


        int su = 100;
        su = m1.test2( su ); //MethodTest의 강제된 int n = n+= => 200 
                        //따라서 test2 메서드에서 호출된 계산식으로 101이 출력

        System.out.println("su : " + su);
       
        
        // su : 인자
        // 만일 return이 없었다면 su는 원래의 데이터:100은 그대로이다
 
        

    }//main
}
