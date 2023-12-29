package practice2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOutNull {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,null,2,null,6);
        List<Integer> list1=list.stream().filter(x->x!=null).collect(Collectors.toList());
        List<String> listS= Arrays.asList("1",null,"2",null,"6");
        List<String> list2=listS.stream().filter(x->x!=null).collect(Collectors.toList());
        System.out.println(list2);
    }
}
