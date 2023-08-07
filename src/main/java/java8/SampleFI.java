package java8;
@FunctionalInterface
public interface SampleFI {
    int add(int a,int b);

    default void sampleAdd(int a) {
        System.out.println(a);
    }
    static void display(int a,int b){
        System.out.println(a*b);
    }
    default void sampleAd(int a) {
        System.out.println(a);
    }
    static void displa(int a,int b){
        System.out.println(a*b);
    }
}
