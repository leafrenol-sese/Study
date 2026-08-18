package poke;

public class Pokemon {
    
    //포켓몬의 정보, 속성값
    
    String name;
    int hp;
    String type;

    public void info(){
        System.out.println("야생의 " + name +"이(가) 튀어나왔다");
        System.out.printf( "hp : %d / type : %s\n" , hp, type);
        System.out.println("-----------------------");
        

    }
}
