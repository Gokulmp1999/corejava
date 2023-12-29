package ibm;

import org.example.threads.C;

import java.util.*;
import java.util.stream.Collectors;

public class PrintDuplicatesInList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,6,3,9,13,12,1,6,6);
        Set<Integer> integerSet=list.stream().filter(x-> Collections.frequency(list,x)>=1).collect(Collectors.toSet());
        integerSet.stream().forEach(x-> System.out.println(x+" Count "+ Collections.frequency(list,x)));
        List<String> listOfDuplicats=Arrays.asList("a","k","a","b");
        Set<String> setString=new HashSet<>(listOfDuplicats);
//        Set<String> setString=listOfDuplicats.stream().filter(x->Collections.frequency(listOfDuplicats,x)>=1).collect(Collectors.toSet());
        setString.stream().forEach(x-> System.out.println(x+" count "+Collections.frequency(listOfDuplicats,x)));
    }
}
