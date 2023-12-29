package corejava;

import java.lang.reflect.Constructor;

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
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException {
        System.out.println(SingleTonClass.getInstance());
        Class<SingleTonClass> singleTonClassClass=SingleTonClass.class;
        Constructor<SingleTonClass> singleTonClassConstructor= singleTonClassClass.getDeclaredConstructor();
        singleTonClassConstructor.setAccessible(true);
        SingleTonClass newin=singleTonClassClass.newInstance();
        if(newin==singleTonClassClass.newInstance()){
            System.out.println("old");
        }else {
            System.out.println("new");
        }

    }
}
