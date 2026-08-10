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


        for(int i = 1; i <= 5; i++ ){
        
            for (int j = 1; j <= 9; j++){
                
                int k = 1;
                if( k % 2 == 1 && k + 1 < i){
                    System.out.print( " * " );
                }else{
                    System.out.println("   ");
                }

                        
            }//inner

            System.out.println();

        }// outer



}// main

}// class end
