package ex04_work;

public class Vending {
    //자판기 역할

    private Can[] cans = new Can[5];
    private int money;

    //자판기에서 관리할 음료수를 준비
    public Vending(){
        cans[0] = new Can("환타", 1000);
        cans[1] = new Can("사이다", 1200);
        cans[2] = new Can("핫식스", 1300);
        cans[3] = new Can("콜라", 1400);
        cans[4] = new Can("생과일주스", 1500);
    } //public Vending(){} == public void init(){} 
      //코드를 단축시킬 수 있다
    //----------------------------------
    // public void init(){
    //     for(int i = 0; i < cans.length; i++){
    //         cans[i] = new Can(); //메모리 할당           
    //     }//for
    //     cans[0].setName("환타");
    //     cans[0].setPrice(1000);
    //     cans[1].setName("사이다");
    //     cans[1].setPrice(1200);
    //     cans[2].setName("핫식스");
    //     cans[2].setPrice(1300);
    //     cans[3].setName("콜라");
    //     cans[3].setPrice(1400); 
    //     cans[4].setName("생과일주스");
    //     cans[4].setPrice(1500);
    // }//init
    
    
    //사용자의 돈을 받는다
    //이 돈으로 먹을 수 있는 음료 목록만 보여주기
    public void showDrink(int money){
        for(int i = 0; i < cans.length; i++){

            if( cans[i].getPrice() <= money){
                //넣은 돈보다 이하이면 if문 실행
                System.out.printf("%s - %d원\n", cans[i].getName(), cans[i].getPrice());
            }//if

        }//for

        this.money = money;
        
        System.out.print(">> "); //구입을 희망하는 음료를 입력,

    }//showDrink

    //사용자가 음료수를 선택(입력)하면
    //해당 음료수를 제공하고 잔돈을 돌려준다
    public void dispense(String name){

        for(int i = 0; i < cans.length; i++){
            if( cans[i].getName().equals(name) ){
                //cans[0]=환타 와 입력된 문자열 '환타'(=dispense(String name))의 문자열이 같으면
                System.out.println(name + "을(를) 선택함");
                money -= cans[i].getPrice(); //잔돈계산
                //입력된 돈에서 i번 열에 있는 지정된 index(가격=get.price)을 뺀다
                System.out.println("잔액 : " +money);

            }


        }//for

    }//dispense

}
