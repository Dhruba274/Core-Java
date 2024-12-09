package oops;

class student{
    int roll;
    String name;
    float marks;
    student(int roll,String name,float marks){
        //This is where this keyword is used to mention the particular roll name and marks
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    
    }
    student (){
        roll = 1;
        name = "Rahul";
        marks = 90.5f;
    
    }
}

public class Class_Practice{
    public static void main(String[] args) {
        // Class Practice
        student Dhruba= new student();
        System.out.println(Dhruba.roll);
        student messi =new student(12,"Lionel messi",90.32f);
        System.out.println(messi.roll);
        System.out.println(messi.name);
    }
    
}
