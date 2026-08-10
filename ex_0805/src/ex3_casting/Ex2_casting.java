package ex3_casting;

public class Ex2_casting {
    public static void main(String[] args) {
     
        //2. 디모션
        // - 작은 자료형에 큰 자료형이 대입되는 것(자동X) *데이터가 손실되어도 출력된다
        char c1 = 'D'; //2byte *캐릭 보다 인트가 바이트가 크다
        int n1 = c1 +1; //4byte *c1은 D, 따라서 D+1="E"로 출력된다
    
        c1 = (char)n1; 
        System.out.println("c1 : "+c1);

        //*손실되는 경우
        float f1 = 5.5F; //4.xbyte 
        int n2 = 0; //4byte *플롯이 인트보다 바이트가 크다
        n2 = (int)f1; //int는 소수점을 저장할 수 없다 f1앞의 "(int)를 기입해서 뒤의 소수점을 버림"
        System.out.println("n2 : " +n2 ); //따라서 출력값은 "5"



    }   
}
