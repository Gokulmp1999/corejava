package functionalInterface;

public class Main {
    public static void main(String[] args) {
        A a = (i,j) -> i+j;

        System.out.println(a.show(2,3));
    }
}
