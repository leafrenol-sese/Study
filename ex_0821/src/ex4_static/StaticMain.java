package ex4_static;

public class StaticMain {
    int n;
    static String str;

    public void test() {
        n = 10;
        str = "안녕";
    }

    public static void test2() {
        // static메서드에서는 일반 변수의 참조가 불가능하다
        // n = 10;
        str = "안녕";

        int num = 100;

        // static 메소드 안에서는 static변수를 정의할 수 없다
        // static int num2 = 200; [X]
        // 메인 static 내용 하나를 바꾸면 그 산하에 있는 서브 static의 내용들도 같이 변경된다
    }

}