package oops;

public abstract class Bank {//we cannot create objects of abstract classes
    String name;

    abstract  void readdata();//Abstract methods do not specify a body
    abstract void writedata();
    
    
}
class Admin extends Bank{
    //The type Admin must implement the inherited abstract method Bank.writedata()Java(67109264)
//The type Admin must implement the inherited abstract method Bank.readdata() So to implemnet the admin class we should have to implement the two methods
    void readdata(){

    }
    void writedata(){

    }
}

class Marketing extends Bank{

    @Override
    void readdata() {
        
    }

    @Override
    void writedata() {
        
    }

}
