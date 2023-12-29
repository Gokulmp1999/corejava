package practice2;

import java.util.Arrays;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,6,3,9,13,12);
        Integer max=list.stream().max(Integer::compareTo).get();
        System.out.println("max "+max);
        list.stream().max((o1,o2)->o1.compareTo(o2)).ifPresent(x-> System.out.println(x));
    }
}
