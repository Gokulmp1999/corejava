package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(3);
        list.add(5);
        Integer minValue= list.stream().min((o1, o2) -> o1.compareTo(o2)).get();
        System.out.println("minValue "+minValue);
        Integer maxValue= list.stream().max((o1, o2) -> o1.compareTo(o2)).get();
        System.out.println("maxValue "+maxValue);
    }
}
