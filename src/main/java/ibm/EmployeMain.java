package ibm;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeMain {

    public static void main(String[] args) {
        List<Employe> employeList = Arrays.asList(new Employe(1, "g", 23, "IT", LocalDate.of(2015, 3, 11), 8888),
                new Employe(2, "g", 23, "IT", LocalDate.of(2015, 3, 11), 2000),
                new Employe(1, "k", 24, "Mech", LocalDate.of(2016, 3, 11), 55556),
                new Employe(10, "ll", 20, "IT", LocalDate.of(2013, 3, 11), 666),
                new Employe(12, "t", 21, "IS", LocalDate.of(2017, 3, 11), 888),
                new Employe(11, "d", 19, "IT", LocalDate.of(2020, 3, 11), 1));
        List<Integer> itIncre = employeList.stream().filter(x -> x.getDepartment().equalsIgnoreCase("It")).map(x -> (x.getSalary() * 10) / 100 + x.getSalary()).collect(Collectors.toList());
        System.out.println("itIncre " + itIncre);
        double average = employeList.stream().mapToDouble(Employe::getSalary).average().getAsDouble();
        System.out.println("average salary " + average);
        Map<String, Double> avgSalaryByDepartMent = employeList.stream().collect(Collectors.groupingBy(
                Employe::getDepartment,
                Collectors.summingDouble(Employe::getSalary)
        ));
        for(Map.Entry<String,Double> avgMap: avgSalaryByDepartMent.entrySet()){
            System.out.println("DepartMent : "+avgMap.getKey() +" avgSalary : "+avgMap.getValue());
        }
        List<Employe> dojafter = employeList.stream().filter(x -> x.getDoj().isAfter(LocalDate.of(2015, 1, 1))).collect(Collectors.toList());
        System.out.println("after 2015 doj " + dojafter);

        Employe highet = employeList.stream().max(Comparator.comparingDouble(Employe::getSalary)).get();
        System.out.println("Higest " + highet);


        Comparator<Employe> employeComparator = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                if (o2.getAge() > o1.getAge()) {
                    return 1;
                } else {
                    return -1;
                }

            }
        };
        System.out.println(employeList.stream().sorted(Comparator.comparingInt(Employe::getAge).reversed()).collect(Collectors.toList()));
        Map<String, List<Employe>> employeesByDepartment = employeList.stream()
                .collect(Collectors.groupingBy(Employe::getDepartment));
        System.out.println(employeesByDepartment);
    }
}

class Employe {
    private int id;
    private String name;
    private int age;
    private String department;
    private LocalDate doj;
    private int salary;

    public Employe(int id, String name, int age, String department, LocalDate doj, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.doj = doj;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public LocalDate getDoj() {
        return doj;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", department='" + department + '\'' +
                ", doj=" + doj +
                ", salary=" + salary + '\'' +
                '}';
    }
}
