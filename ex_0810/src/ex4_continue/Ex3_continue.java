package ex4_continue;

public class Ex3_continue {
    public static void main(String[] args) {
        
        int n = 0;

        while ( n < 10 ) {
            n++;

            if( n % 2 == 0 ){
                continue; //2의 배수를 출력하지 않겠다 //if가 참이면 안의 continue가 발동, while의 조건식으로 올라간다. 
                          //거짓이면 아래의 syso가 출력된다
            }
                System.out.println(n);
        }//while

    }//main
}//class end
