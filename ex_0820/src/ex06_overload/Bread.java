package ex06_overload;

public class Bread {

 
    // 메서드1
    public void makeBread( ) {
       System.out.println("빵을 만들었습니다");
    }


    // 메서드2
    public void makeBread(int cnt) {
        for(int i = 0; i < cnt; i++){}
        System.out.println("빵을 만들었습니다");
    }
    

    // 메서드3
    public void makeBread( String name , int cnt) {
        for(int i = 0; i < cnt; i ++){
            System.out.println(name + "을 만들었습니다");
        }//for

        System.out.printf("요청하신 %d개의 %s을(를) 만들었어요" , cnt , name);
        
      }

}
