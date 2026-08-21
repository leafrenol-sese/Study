package ex3_constructor;

public class PenName {
    
    public static void main(String[] args) {
       
        Pen p1 = new Pen();
        p1.info();
        Pen p2 = new Pen(true); //일반
        p2.info();
        Pen p3 = new Pen(false);
        p3.info();
    }


}
