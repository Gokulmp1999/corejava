package ibm;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(3);
        list.add(5);
        Optional<List<Integer>> optionalList=Optional.ofNullable(list);
        optionalList.isPresent();

    }
}
