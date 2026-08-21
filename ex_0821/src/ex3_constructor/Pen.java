package ex3_constructor;

public class Pen {

    private String name;
    private int price;
    private String color;
    private boolean limited;

    public Pen() { //파라미터가 없는 기본 생성자
        //limited를 파라미터로 받는 생성자 호출
        this(false); // this == pen 

    }

    // 한정판 생성을 위한 오버로딩 생성자
    public Pen(boolean limited) {
        this.limited = limited;
        
        if(limited){
            name = "모나미153-G";
            price = 20000;
            color = "금색";
        
        }else{
            name = "모나미153";
            price = 500;
            color = "흰색";
        }
    }

    public void info() {
        System.out.println("이름 : " + name);
        System.out.println("가격 : " + name);

        if (!limited) { // limited == false
            System.out.println("일반판 : " + color);
        } else {
            System.out.println("한정판 / : " + color);
        }
        System.out.println("일반판 : " + name);
        System.out.println("--------------------");

    }

}
