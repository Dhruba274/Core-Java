package collection;


public class Generics {
    public static void main(String[] args) {
        dog<String,String> d1=new dog<>("Tom","Jerry");
        dog<String,Integer> d2=new dog<String,Integer>("1",2);
        dog<Integer,String>d3 =new dog<Integer,String>(12,"Leo");
        System.out.println(d3.getId(1));
    }
    
}
class dog<E,V>{//This is generic class which supports parameterizerd declaration of parameter
    E id;
   V name;
   //The generics class can take any input of any datatype
    
    public dog(E id,V name ){
        this.id=id;
        this.name=name;
    }
    E getId(E id){
        return this.id=id;
    }
}