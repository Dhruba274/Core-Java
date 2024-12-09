import oops.employee2;
//This imports the oops package to here
 class Employee_Test {
    public static void main(String[] args) {
        //Now we can also access the all reffernce variables from  the class
        employee2 em=new employee2();
       em.id=10932089;
       System.out.println(em.id);
       System.out.println(em.getname());
       em.setphone(943345678);
       em.setname("Vinod");
       System.out.println(em.phone);
       System.out.println(em.getname());
    }

}
