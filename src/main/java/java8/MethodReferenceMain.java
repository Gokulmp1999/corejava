package java8;

public class MethodReferenceMain {
    public static void main(String[] args) {
        Sub sub=new Sub();
        MethodReferenceInter methodReferenceInter=sub::subDisplay;
        methodReferenceInter.display(1,4);
    }
}
class Sub{
    public void subDisplay(int a,int b){
        System.out.println("subDisplay "+(a+b));
    }
}
