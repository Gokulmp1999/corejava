package practice;

import java.util.ArrayList;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> number=new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(1);
        number.add(2);
        number.add(0);
//        int min=number.stream().reduce((integer, integer2) -> integer+integer2).get();
        int min=number.stream().max((o1, o2) -> o1.compareTo(o2)).get();
        System.out.println(min);
    }
}
