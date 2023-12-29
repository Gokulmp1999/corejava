package practice2;



import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortAnList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,6,3,9,13,12);
        List<Integer> collectAsc = list.stream().sorted().collect(Collectors.toList());
        System.out.println(collectAsc);
        List<Integer> collectDesc=list.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(collectDesc);
    }
}
