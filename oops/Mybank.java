package oops;

interface Mybank {
    void write();//We can not even declare a method in interface class as it is already abstracted
    void read();
}
class Sbi implements Mybank{
  
     public void write() {
        System.out.println("SBIWRITE");
    }

    @Override
    public void read() {
        System.out.println("SBIREAD");
        }
}