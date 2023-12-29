package ibm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOutNull {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,6,3,9,13,null,12,1,6,6,null);
        List<Integer> integerList=list.stream().filter(x->(x!=null)).collect(Collectors.toList());
        System.out.println(integerList);
    }
}
