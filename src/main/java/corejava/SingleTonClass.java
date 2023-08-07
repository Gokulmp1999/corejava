package corejava;

public class SingleTonClass {
    private static SingleTonClass singleTonClass=null;
    private SingleTonClass(){};
    public static SingleTonClass getInstance(){
        if (singleTonClass==null){
            singleTonClass=new SingleTonClass();
        }
        return singleTonClass;
    }

}
class Main{
    public static void main(String[] args) {
        System.out.println(SingleTonClass.getInstance());

    }
}
