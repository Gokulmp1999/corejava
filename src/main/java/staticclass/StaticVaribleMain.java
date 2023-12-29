package staticclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticVaribleMain {
    public static void main(String[] args) {

        StaticVaribleMain main=new StaticVaribleMain();

        System.out.println(main.employeList());
    }
    public List<Employe> employeList(){
        List<Employe> employeList=new ArrayList<>();
        Employe employe=new Employe();
        employe.age="23";
        employe.name="gokul";
        employeList.add(employe);
        return employeList;
    }
}


class Employe{
    String name;
    String age;
    static String company;
    static {
        company="TCS";
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
