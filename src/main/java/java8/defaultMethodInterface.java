package java8;

public interface defaultMethodInterface {
    void display();
    default void display2(){
        System.out.println("display2");
    }
    int hashCode();
}
