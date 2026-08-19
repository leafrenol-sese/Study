package ex_work;

public class Ex2_Sub {
   
    public void findActor( String [][] actor, String name, int cnt ){
        //findActor를 호출하면 ( ) <-이 안에 있는 파라미터의 사용을 강제한다
        for( int i = 0; i < actor.length; i++){ 
            //actor.length = 3
            if( actor[i][0].equals( "[" + name +"]" ) ){
                //i가 0일때 송강호, 1일때 조인성, 2일때 이병헌
                
                for(int j = 0; j < actor[i].length; j++){
                    System.out.println(actor[i][j]);
                    //i배우의 j열 영화들이 나온다

                }//inner

            }else{
                cnt++; //찾지 못할때마다 카운트가 늘어난다
                if( cnt == actor.length ){
                    System.out.println("배우정보 없음");
                }
                
            }
            
        }//outer


    }//findActor


}
