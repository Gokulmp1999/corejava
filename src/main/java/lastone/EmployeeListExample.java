package lastone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeListExample {

    public static void main(String[] args) {
        // Create a list to store employee objects
        List<Employee> employeeList = new ArrayList<>();

        // Add employee objects to the list
        employeeList.add(new Employee(1, "John Doe", "Developer", 50000, "M", 23, "2022-01-01"));
        employeeList.add(new Employee(2, "Jane Smith", "Manager", 60000, "F", 20, "2022-02-01"));
        employeeList.add(new Employee(3, "Bob Johnson", "Analyst", 45000, "M", 21, "2021-12-01"));

        System.out.println("max +"+employeeList.stream().max(Comparator.comparingInt(Employee::getAge)).map(x->x.getName()));
        List<Employee>employeesSort=employeeList.stream().sorted(Collections.reverseOrder(Comparator.comparingDouble(Employee::getSalary))).collect(Collectors.toList());
        System.out.println(employeesSort);

        System.out.println("sum "+employeeList.stream().mapToDouble(Employee::getSalary).sum());
        System.out.println("average "+employeeList.stream().mapToDouble(Employee::getSalary).max());
        System.out.println("first join "+employeeList.stream().min(Comparator.comparing(Employee::getJoinDate)).get());
        List<Employee> collect = employeeList.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee::getJoinDate))).collect(Collectors.toList());
        System.out.println("collect "+collect);

//        // Print information about each employee in the list
//        for (Employee employee : employeeList) {
//            System.out.println(employee);
//        }
    }
}

class Employee {
    private int id;
    private String name;
    private String position;
    private double salary;
    private String gender;
    private Integer age;

    private String joinDate;

    // Constructor
    public Employee(int id, String name, String position, double salary,String gender,int age,String joinDate) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.gender=gender;
        this.age=age;
        this.joinDate=joinDate;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Getter and setter methods (not shown for brevity)

    // Override toString method for convenient printing
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", gender=" +  gender+
                ", age=" +  age+
                ", joinDate=" +  joinDate+
                '}';
    }
}
