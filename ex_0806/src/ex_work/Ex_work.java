package ex_work;

public class Ex_work {
    public static void main(String[] args) {
        
        //나이가 15세 이상이거나, 키가 150cm 이상이면 탑승가능
        //그렇지 않으면 탑승불가를 출력

        int age = 18;
        int height = 160;

        String res = "";

        if( age >= 15 || height >=150 ){
            res = "탑승가능";
        }else{
            res = "탑승불가";
        }

        System.out.println(res);
    
        String res2 = age >= 15 || height >= 150 ? "탑승가능" : "탑승불가";

        System.out.println(res2);

        

    }
}
