package oops;
//We have to add public access modifier to use the variables in other package as public is only access modifier which can be access globally
 public class employee2 {
    public int id;
    private String name="DHRUBA";//To access the private variables orr method we need getter for getting the values and setter for setting the values
    public String address;
    public String email;
    public int phone;
    public String designation;
   // public int phn;
    //constructor
    public employee2(){//this constructor need to be access modified to used by the other class
       // System.out.println("This is default constructor");
    }
    public employee2(int id,String name,int phn){
        //This is a paramaterized constructor with 3 parameter
        this.id=id;
        this.name=name;
        this.phone=phn;

    }
        //
    //getter and setter 
   public int getid(){
        return id;
    }
   public String getname(){
        return name;
    }
    public void setid(int id){
        this.id=id;
        }
    public void setphone(int phn){
        this.phone=phn;
    }
    public void setname(String name){
      this. name=name;//We have to use the 'this' keyword here for removing the unnecessary confusion between the employee2 class name and given name in constructor without this keyword---> The assignment to variable name has no effect 
    }
    Sbi branch =new Sbi();
}
