package practice3;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseOrder {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(20,-1,5,100,55,-1000);
        Optional<List<Integer>> optionalList=Optional.ofNullable(list);

        optionalList.ifPresent(x-> System.out.println("value present"));
        List<Integer> list1=optionalList.orElse(Arrays.asList(20,12));
        System.out.println("list1 "+list1);
        if(optionalList.isPresent()){
//            System.out.println(optionalList.get());
            boolean noneMatch=list.stream().noneMatch(x->x==2);
            System.out.println("NoneMatch "+noneMatch);
            boolean allMatch=list.stream().allMatch(x->x==20);
            System.out.println("AllMatch "+allMatch);
            boolean anyMatch=list.stream().anyMatch(x->x==20);
            System.out.println("AnyMatch "+anyMatch);
            int f=list.stream().findFirst().get();
            int findAny=list.stream().findAny().get();
            System.out.println("findAny "+findAny);
            System.out.println("first "+f);
            List<Integer> l=list.stream().limit(0).collect(Collectors.toList());
            System.out.println("Limit "+l);
            Integer max=list.stream().max(Integer::compareTo).get();
            Integer min=list.stream().min(Integer::compareTo).get();
            System.out.println("min "+min);
            System.out.println("max "+max);
            List<Integer> rList=list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

            System.out.println(rList);
        }

    }
}
