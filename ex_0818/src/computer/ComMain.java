package computer;

public class ComMain {
    public static void main(String[] args) {
        
        Computer c1 = new Computer();

        //             <메모리는 이렇게 저장된다>
        //       stack          |        heap
        //______________________|_____________________________
        //  'c1'                |  <Computer>
        //  이라는 '객체'를 통해  |  String brand = "samsung";
        //  오른쪽의 내용이       |  int ssd = 512;
        //  명시적으로 주소가     |  int ram = 256;
        //   지정되었다         |  float cpu = 1.8f;
        //                    |  String color = "whith";
        //                    |  info()

        // 메서드로 불러오려면 '.' < 필요 ex) c1.변수 

        System.out.println("C1 제품");
        c1. ssd = 1024; // => c1의 ssd: 512가 1024로 변경 [*c1만 변경, c2는 그대로다]
        c1. cpu = 3.5f;
        c1. color = "Black";
        
        c1.info(); // -> 앞의 Computer 클래스의 인포를 불러옴
        

        System.out.println("C2 제품");
        Computer c2 = new Computer();
        c2.info();
        // 여기에 만약 [c2.brand = "apple";]을 입력하면 오류
        // 앞의 Computer class에서   private String brand = "samsung";로 'private'에 지정되어 브랜드는 c1과 c2 모두 변경할 수 없다

        // c1의 메모리 주소와 c2의 메모리 주소는 다르다
        // 설계도는 다르지만 객체마다 내용을 변경할 수 있다
        // 메서드를 잘 만들면 재활용하기 편하다

        
    }//main
}
