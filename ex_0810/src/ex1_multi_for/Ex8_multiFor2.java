package ex1_multi_for;

public class Ex8_multiFor2 {
    public static void main(String[] args) {
    
    /*
    1 2 3 4 5 6 7 8 9 10
    2 3 4 5 6 7 8 9 10 1
    3 4 5 6 7 8 9 10 1 2
    ......
    10 1 2 3 4 5 6 7 8 9
    */

    for(int i = 1; i <= 10; i++ ){
        
        for(int j= 0; j < 10; j++){        
           
            int num = i + j; //중간 계산 저장소
           
               if( num >10 )//바로 아래의 한줄까지만 사용한다면 중괄호{}가 필요없다
                 num -= 10;
                
            System.out.print(num + " ");
            
        }//inner

        System.out.println();
        
    }//outer
   

    }//main
}//class end
