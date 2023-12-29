package functionalInterface;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String st="HelloworLd";
        Map<Character,Integer> map=new HashMap<>();

        for(char c:st.toLowerCase().toCharArray()){

            map.put(c, map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
//        char[] c=st.toCharArray();
//        Map<Character,Integer> map=new HashMap<>();
//        int i=0;
//        for(char ch:c){
//            if(map.containsKey(ch)){
//                map.put(ch, map.get(ch)+1);
//            }else{
//                map.put(ch,1);
//            }
//        }
//        System.out.println(map);
//        List<String> listString= Arrays.asList(st.split(""));
//                Set<String> setList=new HashSet(listString);
//        setList.stream().forEach(x-> System.out.println(x +" value "+ Collections.frequency(listString,x)));
    }
}
