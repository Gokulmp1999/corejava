package java8;

import java.util.ArrayList;
import java.util.List;

public class InterAndTerminalStream {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(3);
        list.add(5);
        System.out.println(list.stream().filter(x->x%2==0));
    }
}
