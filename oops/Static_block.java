package oops;

public class Static_block {
{
    System.out.println("HI");
}
    static {
        System.out.println("HEllo");
        //System.exit(0);
        //This will execute first
    }
    public static void main(String[] args) {
        Static_block sb=new Static_block();
        System.out.println("amin");
    }
}
