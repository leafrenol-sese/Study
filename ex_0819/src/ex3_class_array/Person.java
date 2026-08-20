package ex3_class_array;

public class Person {
    
    private int age;
    private String name;
    //두개의 private age와 name을 직접 입력해야 자동완성을 사용할수가 있다
    //get_set 자동완성 : 빈공간 마우스 오른쪽 클릭 > Source Action > Generate getter and setter 
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    

}
