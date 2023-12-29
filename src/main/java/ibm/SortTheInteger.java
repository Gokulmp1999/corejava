package ibm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheInteger {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,6,3,9,13,1200,100);
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
    }
}
