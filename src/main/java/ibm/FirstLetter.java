package ibm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FirstLetter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Alice", "David");
        Map<Character,Long> map=names.stream().collect(Collectors.groupingBy(n->n.charAt(0), Collectors.counting()));
        System.out.println(map);
    }
}
