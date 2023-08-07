package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class CustomizedSorting {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(3);
        list.add(5);
        Stream<Integer> desStream=list.stream().sorted((o1, o2) -> o2.compareTo(o1));
        desStream.forEach(x-> System.out.println(x));

    }
}
