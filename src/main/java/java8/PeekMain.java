package java8;

import java.util.ArrayList;
import java.util.List;

public class PeekMain {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(3);
        list.add(5);
        list.stream().filter(x->x%2==0).map(x->x+2).peek(System.out::println).filter(x->x>=10).forEach(x-> System.out.println(x));
    }
}
