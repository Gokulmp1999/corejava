package practice2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxWithString {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("c","a","g","x","i");
        List<String> list1=list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        String min=list.stream().max(String::compareTo).get();
        List<Integer> listInt= Arrays.asList(20,-1,5,100,55,-1000);
        listInt.stream().min(Integer::compareTo).get();
        System.out.println(min);
        System.out.println(list1);
    }
}
