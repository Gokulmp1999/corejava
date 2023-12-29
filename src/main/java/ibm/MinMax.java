package ibm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(3);
        list.add(5);
        System.out.println(list.stream().max(Integer::compareTo));
        List<String> listString= Arrays.asList("c","a","g","x","i");
        String max=listString.stream().max(String::compareTo).get();
        System.out.println(max);
    }
}
