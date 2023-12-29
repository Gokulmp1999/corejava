package groupBy;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class ZeroAndOnce {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,0,0,1,1,1,0);
        List<Integer> z=list.stream().filter(i->i==0).collect(Collectors.toList());
        List<Integer> o=list.stream().filter(i->i==1).collect(Collectors.toList());
        List<List<Integer>> n=Arrays.asList(o,z);
        List<Integer> s=n.stream().flatMap(Collection::stream).collect(Collectors.toList());
//        System.out.println(s);
//        List<Integer> g=list.stream().collect(Collectors.groupingBy(i->i==0,));
        List<Integer> list2=new ArrayList<>();
        for(Integer i:list){
            if(i==0){
                list2.add(i);
            }
        }
        for(Integer i:list){
            if(i==1){
                list2.add(i);
            }
        }
        System.out.println("java 7 "+list2);
        ///java 8

        System.out.println("java 8 "+list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));

    }



}
