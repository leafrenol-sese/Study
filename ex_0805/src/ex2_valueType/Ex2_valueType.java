package ex2_valueType;

public class Ex2_valueType {
    public static void main(String[] args) {
        //문자형 : 홑따옴표('') 안에 딱 한글자만 저장할 수 있는 자료형
        char ch = 'A';
        char ch2 = 65+1; //아스키코드를 이용, 'B'로 변경되어 출력

        System.out.println("ch : "+ ch2);
        //실수형 : 소수점을 포함하는 값을 저장하기 위한 자료형
        float f1 = 100; //소수점이 강제로 추가되어 '100.0'으로 변경되어 출력 + 위에 있던 100을 3.14가 덮어 씌워졌기 때문에 변경됨
        f1 = 3.14F; //소수점을 이용하기 위해서는 변수 뒤에 'F or f'를 입력해야 한다
        System.out.println("f1 : " + f1);
        double d1 = 3.14;

        System.out.println("f1 : "+ f1);
        System.out.println("d1 : "+ d1);

    
    }
}
