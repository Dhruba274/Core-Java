package oops;

public class oops1 {
    public static void main(String[] args) {
        animal cat = new animal();
        cat.legs = 4;
        cat.eat();
        System.out.println(cat.legs);
    }
    
}
//encaptulation example
 class  employee{
    private int empid;
    private String name;
    private int age;
    int getid(){
        return empid;
    }
    void setid(int id){
        empid = id;
    }
}


class animal {
    int legs;
    int eye;
    void eat() {
        System.out.println("Animal eats");
    }
}