package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(3);
        list.add(5);
        System.out.println(list);
        List<Integer> list1=new ArrayList<>();
        list1=list.stream().filter(i->i>=15).collect(Collectors.toList());
        list1.stream().forEach(i-> System.out.println(i));

    }
}
