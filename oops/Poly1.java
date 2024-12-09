package oops;
class Feature{
    int add(int a,int b){
        //To call the method directly without creating object We need to implement the static keyword
        return a+b;

    }
    //Method Overloading
   String add(String s1, String s2){
    
        return s1+s2;
    }
}
public class Poly1 {
    public static void main(String[] args) {
        Feature ad= new Feature();
        System.out.println(ad.add(10, 20));
        System.out.println(ad.add("Hello","World"));
    }
}
