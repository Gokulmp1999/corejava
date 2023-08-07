package java8;

import java.util.function.Predicate;

public class PredicateJoining {
    public static void main(String[] args) {
        Predicate<String> predicateLength=s->s.length()>=5;
        Predicate<String> predicateLengthEven=s->s.length()%2==0;
        System.out.println("And condition " + predicateLength.and(predicateLengthEven).test("gokul"));
        System.out.println("Or condition " + predicateLength.or(predicateLengthEven).test("gokul"));
        System.out.println("negate condition " + predicateLength.negate().test("gokul"));
    }
}
