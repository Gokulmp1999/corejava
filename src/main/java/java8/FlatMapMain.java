package java8;

import java.util.*;
import java.util.stream.Collectors;

public class FlatMapMain {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        List<Integer> flattenedList = listOfLists.stream()
                .flatMap(List::stream) // Flattening the lists
                .collect(Collectors.toList());

        System.out.println(flattenedList);
        Map<String,String> map=new HashMap<>();
        map.put("1","g");
        Set<Integer> s=new HashSet<>();

    }
}
