package practice2;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeClass {
    private int id;
    private String name;
    private String departMent;
    private int salary;

    private LocalDate joinDate;

    public EmployeClass(int id, String name, String departMent, int salary,LocalDate joinDate) {
        this.id = id;
        this.name = name;
        this.departMent = departMent;
        this.salary = salary;
        this.joinDate=joinDate;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartMent() {
        return departMent;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "EmployeClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", departMent='" + departMent + '\'' +
                ", salary=" + salary +
                ", doj=" + joinDate +
                '}';
    }
}
class EmployeMain{
    public static void main(String[] args) {
        List<EmployeClass> employeClassList= Arrays.asList(new EmployeClass(1,"gg","IT",2000,LocalDate.of(2015,03,02))
        ,new EmployeClass(2,"dd","IT",2000,LocalDate.of(2013,8,02))
        ,new EmployeClass(10,"ss","mech",10,LocalDate.of(2019,6,02))
        ,new EmployeClass(3,"gg","mech",500,LocalDate.of(2020,5,02)));
//List<EmployeClass> employeClassList1=employeClassList.stream().filter(x->x.getJoinDate().isAfter(LocalDate.of(2015,01,01))).collect(Collectors.toList());
//        System.out.println(employeClassList1);
//        employeClassList.stream().filter(x->x.getDepartMent().equalsIgnoreCase("IT")).mapToDouble(EmployeClass::getSalary).average().ifPresent(x-> System.out.println(x));
        Comparator<EmployeClass> listComparator=new Comparator<EmployeClass>() {
            @Override
            public int compare(EmployeClass o1, EmployeClass o2) {
                if(o1.getSalary()> o2.getSalary()){
                    return 1;
                }else {
                    return -1;
                }

            }
        };
        System.out.println(employeClassList.stream().sorted(listComparator).collect(Collectors.toList()));
    }
}