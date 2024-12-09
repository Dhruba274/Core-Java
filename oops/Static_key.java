package oops;

 class Static_key {
    static int a=10;
    static int b=20;
    static void add()
    {
        System.out.println(a+b);

    }
    public static void main(String[] args) {
        Static_key st=new Static_key();
        //The static method add() from the type Static_key should be accessed in a static way So this is a not a right approach to do
        //So by add static keyword we can directly access the class without creating any instances or object
       st.add();
       Static_key.add();//This is the right approach to call the method

    }
}
