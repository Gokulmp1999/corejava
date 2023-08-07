package java8;

import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
        Function<Integer,Integer> add=a->a+1;
        System.out.println("add the value "+add.apply(5));
    }
}
