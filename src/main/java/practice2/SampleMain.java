package practice2;

public class SampleMain {
    public static void main(String[] args) {
        Sub1 sub1=new Sub1();
        try {
            int r=sub1.display(5,5);
            System.out.println("result "+r);
        }catch (RuntimeException runtimeException){
            runtimeException.getMessage();
        }
    }
}

class Sub1{
    public int display(int a,int b){
        int d = 0;
        try {
             d=a/0;
        }catch (NullPointerException nullPointerException){
            nullPointerException.getMessage();
        }
        return d;
    }
}
