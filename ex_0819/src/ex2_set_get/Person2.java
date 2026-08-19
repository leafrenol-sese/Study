package ex2_set_get;

public class Person2 {
    
    private String name;
    private int age;

    public void setInfo( String name, int age ){
        this.name = name;
        this.age = age;
    } //처음보는 다른 사람이 이어서 할수 있도록 가독성이 확보되어야 한다
      //this. => 현재 클래스의 자신, .뒤에 아무것도 없다면 가장 가까운 지역변수
      // this.name = name; => [현재 클래스 name은 메인서브에 있는 name이다] 라는 뜻

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}
