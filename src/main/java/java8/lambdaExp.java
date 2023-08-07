package java8;

import java.util.function.BiConsumer;

public class lambdaExp {

    public static void main(String[] args) {
        SampleFI addMethod=(a,b)-> a+b;
        int addre=addMethod.add(2,3);
        System.out.println(addre);
    }

}
