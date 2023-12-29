package practice1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(50);
        list.add(10);
        list.add(20);
        list.add(500);
        List<Integer> list1 = list.stream().sorted(((o1, o2) -> o2.compareTo(o1))).collect(Collectors.toList());
        System.out.println(list1.stream().max(Integer::compareTo).get());
        System.out.println(list1);
    }
}
