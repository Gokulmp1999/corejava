package practice3;

import java.util.*;
import java.util.stream.Collectors;

public class RepeatedString {
    public static void main(String[] args) {
        String java="fhfkfldd";
        List<String> stringList= Arrays.asList(java.split(""));
        Set<String> stringSet=stringList.stream().filter(x-> Collections.frequency(stringList,x)>1).collect(Collectors.toSet());
        Set<String> count=new HashSet<>(stringList);
        count.stream().forEach(x-> System.out.println(x+" "+Collections.frequency(stringList,x)));
    }
}
class RepeatedStrings{
    public static void main(String[] args) {
        String words="i love you you love";
        List<String> stringList=Arrays.asList(words.split(" "));
        List<String> stringList1=stringList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
//        Set<String>  stringSet=new LinkedHashSet<>(stringList);
//        Set<String> list=stringList.stream().filter(x-> Collections.frequency(stringList,x)>1).collect(Collectors.toSet());
//        stringSet.removeAll(list);
//        System.out.println(stringSet);
    }
}
