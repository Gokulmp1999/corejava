package java8;

import java.util.stream.Stream;

public class OfMain {
    public static void main(String[] args) {
        Stream.of(2,4,8,9,7,1).filter(x->x%2==0).forEach(x-> System.out.println("Even "+x));
    }
}
