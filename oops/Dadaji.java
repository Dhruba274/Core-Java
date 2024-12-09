package oops;

public class Dadaji {
    String name="Ng";
    String surname="Ghsoh";
    
}
interface Ma{
    void eyes();
}

class Baba extends Dadaji{
    String name="Pk";
    String surname="Ghsoh";
    int propert=70;
}
class Maa implements Ma{
    String name="Soma";
    String surname="Ghsoh";
    int propert=30;
    public void eyes(){
        System.out.println("eyes");
    }
}
class Me extends Baba {
    String name="Dhruba";
}
 class run{
    public static void main(String[] args) {
       Me m=new Me();
       System.out.println(m.name+" "+m.surname);
        }
}