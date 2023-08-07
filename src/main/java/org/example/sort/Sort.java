package org.example.sort;

import java.util.*;

class Students implements Comparable<Students>{
    Integer age;
    String name;

    public Students(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Students that) {
        return this.age>that.age?1:-1;
    }
}
public class Sort {


    public static void main(String[] args) {
        Comparator<Students> comparator=(Students students, Students students1) ->{
            return students.age >students1.age?1:-1;
            };


        List<Students> list=new ArrayList();
        list.add(new Students(24,"Gokul"));
        list.add(new Students(26,"Rp"));
        list.add(new Students(30,"Vrm"));
        list.add(new Students(12,"Raji"));
        list.add(new Students(10,"Leo"));
        for (Students students:list){
            System.out.println(students);
        }
        System.out.println("after sort");
        Collections.sort(list);
        for (Students students:list){
            System.out.println(students);
        }
//        List<String> list1=new ArrayList<>();
//        list1.add("Gokul");
//        list1.add("zzzz");
//        list1.add("das");
//        System.out.println(list1);
//        Collections.sort(list1);
//        System.out.println(list1);

    }

}
