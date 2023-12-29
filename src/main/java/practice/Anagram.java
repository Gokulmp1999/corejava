package practice;

import java.util.Arrays;
import java.util.stream.Stream;

public class Anagram {
    public static void main(String[] args) {
        String s="gokul";
        char[] a=s.toCharArray();
        String s1="lkugo";
        char[] b=s1.toCharArray();
Arrays.sort(a);
Arrays.sort(b);
        Stream.of(a).forEach(n-> System.out.println(n));
        Stream.of(b).forEach(n-> System.out.println(n));
        boolean res=anagram(a,b);
        if(res){
            System.out.println("anagarm");
        }
        else {
            System.out.println("not anagram");
        }

       }

    private static boolean anagram(char[] a, char[] b) {
        if(a.length!=b.length){
            return false;
        }
        boolean ana=false;
        for (int i=0;i<a.length;i++){
            if(a[i]==b[i]){
                ana=true;
            }
            else {
                return false;
            }
        }
        return ana;
    }
}
