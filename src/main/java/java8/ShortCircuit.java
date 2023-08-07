package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShortCircuit {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(3);
        list.add(5);
        List<Integer> s = list.stream().limit(2).collect(Collectors.toList());
        s.stream().forEach(x -> System.out.println("limit " + x));
        Integer findFirst = list.stream().findFirst().get();
        System.out.println("findFirst " + findFirst);
        Integer findAny = list.stream().findAny().get();
        System.out.println("findAny " + findAny);
        Integer any = list.stream().parallel().findAny().get();
        System.out.println("parallelStream findAny " + any);
        boolean containsAnyMatch = list.stream().anyMatch(x -> x == 2);
        System.out.println("it contain 2 " + containsAnyMatch);
        List<String> name = new ArrayList<>();
        name.add("gokulmp");
        name.add("mp");
        name.add("leomp");
        boolean containsAllMatch = name.stream().allMatch(x -> x.contains("mp"));
        System.out.println("it contain mp " + containsAllMatch);
        Boolean containsNonMatch = name.stream().noneMatch(x -> x.contains("mp"));
        System.out.println("it should not contain mp " + containsNonMatch);


    }
}
