package collection;

public class Animal implements Comparable<Animal> {
    //Comarator_Comparable class
    int age;
    String name;
    int weight;
    Animal(int age,String name,int weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Animal [age=" + age + ", name=" + name + ", weight=" +
        weight + "]"+"\n";
    }
   
    @Override
    public int compareTo(Animal that){
        if(this.age==that.age){
            return this.name.compareTo(that.name);
        }
        return this.age-that.age;
    }
    
}
