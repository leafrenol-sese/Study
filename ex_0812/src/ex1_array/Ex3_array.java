package ex1_array;

public class Ex3_array {
    public static void main(String[] args) {
        
        char[] ch = new char [4]; // Stack메모리: ch / Heap메모리 : 4개(0, 1, 2, 3)
        ch[0] = 'J'; 
        ch[1] = 'A'; 
        ch[2] = 'V'; 
        ch[3] = 'A';

        for( int i = 0; i < ch.length; i++ ){
            System.out.println( ch[i] );
        }//for
        
        System.out.println("-------------------");

        char[] ch2 = {'J', 'A','V','A'}; //한줄로 작성하는 경우, 배열의 선언과 초기화를 한꺼번에, 재활용은 안된다
       
        for(int i = 0; i < ch2.length; i++){
            System.out.println(ch2[i]);
       
        }//for

    }//main
}//class end
