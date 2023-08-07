package org.example.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setss {
    public static void main(String[] args) {
        Set<Integer> setsS= new TreeSet<Integer>();
        setsS.add(1);
        setsS.add(5);
        setsS.add(2);
        setsS.add(5);
        setsS.add(100);
        setsS.add(3);
        System.out.println(setsS);

    }
}
