package ex1_multi_for;

public class Ex2_multiFor {
    public static void main(String[] args) {
        
        //01 02 03 04
        //05 06 07 08
        //09 10 11 12

        int cnt = 0; //외부 변수를 이용,
        
        for(int i = 1; i <= 3; i++){ //for문으로 반복문을 만들고

            for(int j = 1; j <= 4; j++){

                
                System.out.printf("%02d " , ++cnt); //cnt에 들어온 for의 출력값들이 입력됨
 
            }//inner

            System.out.println();
      
                    

        }//outer


    }//main
}//class end
