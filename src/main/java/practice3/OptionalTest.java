package practice3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        // If the list is empty
        List<Integer> emptyList = Arrays.asList();
        Optional<List<Integer>> optionalEmptyList = Optional.ofNullable(emptyList);
        List<Integer> resultEmpty = optionalEmptyList.orElse(Arrays.asList(1, 2));

        System.out.println("Result (Empty List): " + resultEmpty);

    }
}
