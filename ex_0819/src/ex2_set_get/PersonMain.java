package ex2_set_get;

public class PersonMain {
    public static void main(String[] args) {
        
        Person p1 = new Person();
        p1.setGender( "여자" ); //1)파라미터 "여자"를 입력, 서브의 메소드에 사용
        System.out.println("성별 : " + p1.getGender());
        //4)getGender에서 "여자"가 입력된체 출력

        p1.setName("홍길동");
        System.out.println("이름 : " + p1.getName());

        p1.setAge(30);
        System.out.println("나이 : " + p1.getAge());

        System.out.println("-------------------------");

        Person2 p2 = new Person2();
        p2.setInfo("홍길동", 30);

        System.out.println("이름 : " + p2.getName());
        System.out.println("나이 : " + p2.getAge());


    }//main
}
