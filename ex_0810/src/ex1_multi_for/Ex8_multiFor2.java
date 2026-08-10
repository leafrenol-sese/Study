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

    for(int i = 1; i < 10; i++ ){
        
        for(int x = 0; x <= 9; x++){
        
            int res = x + i;
            
            if(res > 10){
                System.out.print( res - 10 + " " );

            } else {
                System.out.print( res + " ");
            }//if

        }//inner
        System.out.println();
        
    }//outer
   

    }//main
}//class end
