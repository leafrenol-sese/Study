package ex_work;

public class Ex03_work {
    public static void main(String[] args) {
        
        //배열 arr에 담긴 값 중, 가장 큰 값을 출력
        //------------------------
        //가장 큰 값 : 19

        int[] arr = {4, 13, 7, 19, 1, 15};

        int max = arr[0]; //= [4], 시작부터 index 0의 값으로 max를 지정했기 때문에 아래의 for문 'int i = 0'이 아닌 'int i = 1'로 시작 

        for(int i = 1; i < arr.length; i++){ //arr.length = 6 (배열의 갯수)
            
            if( arr[i] > max ){ 
                //'i=1 -> max = 13' [t / max는 7로] ~> 'i=2 -> max = 7' 과 13을 비교:[13이 큼으로 f / max는 13으로] 
                //'i=3 -> max = 19' 전의 13과 비교:[19가 큼으로 t / max는 19] ..... 
             max = arr[i]; //결과 max = 19로 남게됨

            }//if
                      
        }//for
        System.out.println("가장 큰 값 : " + max );



    }//main
}//class end
