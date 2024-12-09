public class Fibbonaci {
     
        public int fib(int n) {
            if(n<=1)return n;
            int i = fib(n-1);
            int j = fib(n-2);
            return i + j;
    
        }

        public static void main(String[] args) {
            Fibbonaci fb=new Fibbonaci();
            System.out.println(fb.fib(6));
        }
    }   

