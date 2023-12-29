package practice3;

public class MethodOverLoading {
    public static void main(String[] args) {
        MethodOverLoading methodOverLoading=new MethodOverLoading();
//        methodOverLoading.add(20,20);
    }

    public String  add(int a,double b){
        double c=a+b;
        System.out.println("add 2");
        return "add 2 "+c;
    }
    public String  add(double b,int a){
        double c=a+b;
        System.out.println("add 1");
        return "add 1 "+c;
    }
}
