package practice;

import java.util.HashSet;
import java.util.Set;

public class IsoGram {
    public static void main(String[] args) {
       String str="penn";
       char[] s=str.toCharArray();
       boolean iso = false;
        Set<Character> chSet=new HashSet<>();
        for (Character c:s){
            if (chSet.contains(c)){
                iso=false;
            }
            else {
                chSet.add(c);
                iso=true;
            }
        }
        if(iso){
            System.out.println("iso");
        }else {
            System.out.println("not iso");
        }
    }
    
}
