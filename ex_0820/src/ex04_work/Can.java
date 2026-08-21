package ex04_work;

public class Can {
    //자판기 속의 캔

   private String name;
   private int price; //여기까지 내가 입력,
    //위를 입력후, 아래는 자동완성 Source action, get과 set을 만들어준다
   
    public Can( String name, int price ){
        this.name = name;
        this.price = price;

   }
   
   
   public String getName() {
    return name;
   }
      
   public int getPrice() {
    return price;
   }
  
   
   


}
