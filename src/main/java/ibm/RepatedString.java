package ibm;

import java.util.*;
import java.util.stream.Collectors;

public class RepatedString {
    public static void main(String[] args) {
        String java="fhfkflddd  love hi love";
        List<String> listString= Arrays.asList(java.split(" "));
        Set<String> setString=new HashSet<>(listString);

        setString.stream().filter(x->!x.equalsIgnoreCase("")).forEach(x-> System.out.println(x+" Count "+Collections.frequency(listString,x)));
//        char[] javaChar=java.toCharArray();
//        Map<Character,Integer> map=new HashMap();
//        for(Character c:javaChar){
//            if(!Character.isWhitespace(c)){
//                if(map.containsKey(c)){
//                    map.put(c,map.get(c)+1);
//                }else{
//                    map.put(c,1);
//                }
//            }
//        }
//        for(Map.Entry<Character,Integer> m:map.entrySet()){
//            System.out.println(m.getKey()+" count "+m.getValue());
//        }
    }
}
