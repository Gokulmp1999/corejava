package practice;

public class FibSuingRecurison {
    public static void main(String[] args) {
        int nu=5;
        System.out.println(fib(nu));

    }
    static int fib(int a){
        if(a<=1){
            return a;
        }else{
            return fib(a-1)+fib(a-2);
        }
    }
}
