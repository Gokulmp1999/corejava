package practice2;

import org.example.threads.C;

import java.util.*;
import java.util.stream.Collectors;

public class RepetedString {
    public static void main(String[] args) {
        String s = "javvaa  gg";

       Map<Character,Integer> map=new HashMap<>();
        char[] c=s.toCharArray();
        for (char st:c){
            if(!Character.isWhitespace(st)) {
                if (map.containsKey(st)) {
                    map.put(st, map.get(st) + 1);
                } else {
                    map.put(st, 1);
                }
            }
        }
        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() +" count "+ entry.getValue());
            }
        }
        System.out.println(map);
    }

}
class RepetedUsingJava8{
    public static void main(String[] args) {
//        String s = "javvaa  gg";
//        Map<Character,Long> map=s.chars().mapToObj(c->(char) c).filter(c->!Character.isWhitespace(c)).collect(Collectors.groupingBy(c->c,Collectors.counting()));
//        map.forEach((k,v)->{
//            if(v>1){
//                System.out.println(k +" "+ v);
//            }
//        });
    }
}
