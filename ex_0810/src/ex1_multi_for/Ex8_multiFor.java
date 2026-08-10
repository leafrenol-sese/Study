package ex1_multi_for;

public class Ex8_multiFor {
    public static void main(String[] args) {
    
    /*
    1 2 3 4 5 6 7 8 9 10
    2 3 4 5 6 7 8 9 10 1
    3 4 5 6 7 8 9 10 1 2
    ......
    10 1 2 3 4 5 6 7 8 9
    */

    for(int i = 0; i < 10; i++ ){
        
        
        for(int j = 0; j < 10; j++){
        

            System.out.print( ((j + i)%10 + 1) + " " );   
        
        }//for
       

        System.out.println();

    }//outer
    

    }//main
}//class end
