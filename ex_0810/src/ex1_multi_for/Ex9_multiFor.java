package ex1_multi_for;

public class Ex9_multiFor {
    public static void main(String[] args) {
        
        /*
                *
              * * *
            * * * * * 
          * * * * * * *
        * * * * * * * * * 
        
        */


        for(int i = 0; i < 5; i++ ){
        
            for (int j = 0; j < 5 + i; j++){
                if( i + j >3) //필요 없는 부분과 출력해야하는 부분을 구분함
                 System.out.print("* ");
                else
                 System.out.print("  ");
                        
            }//inner

            System.out.println();

        }// outer
            
}// main

}// class end
