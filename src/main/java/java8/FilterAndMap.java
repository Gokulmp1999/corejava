package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterAndMap {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(3);
        list.add(5);
        Stream<Integer> s=list.stream().filter(i->i%2==0);
        s.forEach(i-> System.out.println(i));
//        list.stream().map(i->i+10).forEach(i-> System.out.println(i));

    }
}
