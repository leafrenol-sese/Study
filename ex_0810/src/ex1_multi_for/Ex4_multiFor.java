package ex1_multi_for;

public class Ex4_multiFor {
    public static void main(String[] args) {
        

        //*****
        //12345
        //*****
        //12345
        //*****

        for(int i = 1; i <= 5; i++){ 
        
        for(int j = 1; j <= 5; j++){
            if ( i % 2 == 1 ){

            System.out.print("* ");
            }else{
            System.out.print(j + " ");
            }      

            }//iner

         System.out.println();

        }//outer        

    }//main
}//class end
