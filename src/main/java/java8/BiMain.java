package java8;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiMain {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> add=(a,b)->{
            int c=a+b;
            System.out.println("add result "+c);
        };
        add.accept(1,5);

        BiPredicate<Integer,Integer> higher=(a,b)->a+b>=10;
        System.out.println("BiPredicate "+higher.test(5,6));

        BiFunction<Integer,Integer,Integer> addBiFunction=(a,b)->a+b;
        System.out.println("BiFunction "+addBiFunction.apply(5,5));
    }
}
