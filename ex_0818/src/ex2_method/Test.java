package ex2_method;

public class Test {
    
    public String average( int su1 , int su2 , int su3){ //average를 호출하고 싶다면 정수 3가지가 필요하다
                            // su1, su2, su3 을 '파라미터'라 부른다
        int num = su1 + su2 + su3 / 3 ;

        if(num > 50){
            return "합격";
        }else{
            return "불합격";
        }

    }
}
