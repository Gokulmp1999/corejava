package dca;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter");
        String str=scanner.nextLine();
        List<String> vowels= Arrays.asList("a","e","i","o","u");

        char[] chars=str.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(vowels.contains(chars[i])){
                for(int j=i+1;j<chars.length;j++){
                    if(vowels.contains(chars[j])){

                    }
                }
            }
        }

    }
}
