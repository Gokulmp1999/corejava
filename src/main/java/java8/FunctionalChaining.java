package java8;

import java.util.function.Function;

public class FunctionalChaining {
    public static void main(String[] args) {
        Function<Integer,Integer> doubleIt=i->i*2;
        Function<Integer,Integer> cubeIt=i->i*i*i;
        int resultandThen=doubleIt.andThen(cubeIt).apply(2);
        int resultCompose=doubleIt.compose(cubeIt).apply(2);
        int resultMultipleAndThen=doubleIt.andThen(cubeIt).andThen(cubeIt).andThen(doubleIt).apply(2);
        int resultMultipleCompose=doubleIt.compose(cubeIt).compose(cubeIt).compose(doubleIt).apply(2);
        int resultMultipleAndThenAndThen=doubleIt.andThen(cubeIt).compose(doubleIt).andThen(cubeIt).compose(doubleIt).apply(2);
        System.out.println("result andThen "+resultandThen);
        System.out.println("resultCompose "+resultCompose);
        System.out.println("resultMultipleAndThen "+resultMultipleAndThen);
        System.out.println("resultMultipleAndThen "+resultMultipleCompose);
        System.out.println("resultMultipleAndThenAndThen "+resultMultipleAndThenAndThen);
    }
}
