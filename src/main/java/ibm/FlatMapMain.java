package ibm;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapMain {
    public static void main(String[] args) {
        List<List<Integer>> nestedLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(3, 4, 5),
                Arrays.asList(5, 6, 7)
        );

        List<Integer> integerList=nestedLists.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(integerList);
    }
}
