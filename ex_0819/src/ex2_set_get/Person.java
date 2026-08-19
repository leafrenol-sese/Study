package ex2_set_get;

public class Person {
    
    private String gender;
    
    public void setGender( String s ){
        gender = s;
    //2)메인에서 가져온 "여자"라는 파라미터가  gender = s = "여자"에 저장
    
    }
    //private이라 외부는 사용 못하지만, setGender를 호출하면서 성별을 설정이 가능해진다

    public String getGender(){
        return gender;
    //"여자"라는 String 데이터는 getGender에 이동, PersonMain 보드로 돌아간다
    }

    //-----------------------------

    private String name;
    public void setName( String n ){
        name = n;
    }
    public String getName(){
        return name;
    }

    //----------------------------

    private int age; 
    public void setAge( int a ){
        age = a;
    }
    public int getAge(){
        return age;
    }

}
