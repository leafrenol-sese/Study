package ex03_work;

public class Atm {
    
    private int money; //잔액, 외부에서 수정할 수 없게 private 사용

    //입금
    public void deposit( int money ){
        System.out.println("입금성공");
        this.money += money;
        //this.money=private int money : ATM에 저장된 금액
    }//eposit


    //출금
    public void withdraw( int money ){
        if( this.money - money < 0 ){
            System.out.println("잔액부족");
        }else{
            System.out.println("출금성공");
            this.money -= money; //지금까지의 예금에서 출금
        }//if-else
    }//withdraw

    
    //잔액확인
    public void balance(){
        System.out.println("잔액 : " + money);
    }//balance
   



}
