package ex3_class_array;

public class PersonMain {
    public static void main(String[] args) {
        
        Person[] p1 = new Person[2];
        
        //반드시 각 index의 객체화를 해줘야 한다 (String은 암시적 객체화 때문에 제외)
        //p1[0] = new Person(); 
        //p1[1] = new Person();
        //위처럼 지정해도 되지만 p1.length가 많아지면 
        //아래의 for문으로 지정해한다
        for (int i = 0; i < p1.length; i++){
            p1[i] = new Person();
        }
        p1[0].setName("홍길동");
        p1[0].setAge(20);

        p1[1].setName("김길동");
        p1[1].setAge(25);

        //홍길동 / 20
        //김길동 / 25

        for(int i = 0; i <p1.length; i++){
        
            System.out.printf("%s / %d\n" , p1[i].getName(), p1[i].getAge() );

        }
        
        //set 지정한다
        //get 지정한 값에 대한 데이터 저장값


    }//main
}
