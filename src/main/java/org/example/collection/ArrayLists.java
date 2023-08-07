package org.example.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> num= new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(5);
        num.add(5);
        num.add(3);
        Collections.sort(num);
        System.out.println(num);
//        List<Integer> num1= new ArrayList<Integer>();
//        System.out.println(num1.addAll(num));

//
//
//        System.out.println(num1+"jj");
//                List<String> str= new ArrayList<String>();
//                str.add("Gokul");
//                str.add("mp");
//        System.out.println(str);
//                for (String strr:str){
//                    if (strr.contains("mp")){
//                        int index=str.indexOf("mp");
//                        str.remove(index);
//                        str.add(index,"das");
//                    }
//                }
//        System.out.println(str);


    }
}
