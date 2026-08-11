package ex5_label;

public class Ex2_label {
    public static void main(String[] args) {
        
        my : for( int i = 1; i <= 5; i ++){
            
            switch (i) {
                case 1:
                    System.out.println( "case 1");
                    break my; //swiych문을 나가는게 아니라 for문을 나가게된다. 
                              //아래의 syso()"안녕"은 for문 안에 있기 때문에 출력되지 않는다            
            }//switch

            System.out.println("안녕");

        }//for

    }//main
}//class end
