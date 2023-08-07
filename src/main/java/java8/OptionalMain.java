package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("gokulmp");
        name.add("mp");
        name.add("leomp");
        name.add("raji");
        Optional<List<String>> nameOptional=Optional.ofNullable(name);
        nameOptional.ifPresent(x-> System.out.println(x));
    }
}
