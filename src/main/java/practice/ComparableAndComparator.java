package practice;

import java.util.*;

public class ComparableAndComparator {
    public static void main(String[] args) {
        Comparator<Integer> comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1<o2){
                    return 1;}
                else{
                    return -1;}
            }
        };
        List<Empl> emplList=new ArrayList<>();
        List<Integer> nu=Arrays.asList(2,1,3,8,5);
        emplList.add(new Empl(5,"gokul"));
        emplList.add(new Empl(8,"ad"));
        emplList.add(new Empl(1,"cf"));
        emplList.add(new Empl(3,"xx"));

        Comparator<Empl> emplComparator=(Empl o1, Empl o2) -> {
            if (o1.getId() > o2.getId()) {
                return 1;
            } else {
                return -1;
            }
        };


        Comparator<Empl> emplComparatorWithName=new Comparator<Empl>() {
            @Override
            public int compare(Empl o1, Empl o2) {
                return o1.compareTo(o2);
            }
        };

        Collections.sort(nu,comparator);
        Collections.sort(emplList,emplComparatorWithName);
        System.out.println(emplList);
        System.out.println(nu);

    }
}
class Empl implements Comparable<Empl>{
    private int id;
    private String name;

    public Empl(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    @Override
    public int compareTo(Empl o) {
//      if(this.id<o.id){
//         return 1;
//      }else {
//          return -1;
//      }
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Empl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
