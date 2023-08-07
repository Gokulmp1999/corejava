package java8;

import java.util.function.Consumer;

public class ConsumerMain {
    public static void main(String[] args) {
        Consumer<Integer> add=i-> System.out.println(i+10);
        add.accept(5);
        Consumer<Integer> sub=i-> System.out.println(100-i);
        sub.accept(5);
        add.andThen(sub).accept(10);
    }
}
