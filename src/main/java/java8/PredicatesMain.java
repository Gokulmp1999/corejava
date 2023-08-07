package java8;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicatesMain extends PredicateSub {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name");
        String name=scanner.nextLine();
PredicatesMain predicatesMain=new PredicatesMain();
        System.out.println(name+" length is greater than 5 is "+predicatesMain.predicate.test(name));

    }
}
