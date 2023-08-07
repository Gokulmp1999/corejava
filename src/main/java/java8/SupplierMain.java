package java8;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {
        Supplier<Integer> age=()->24;
        System.out.println("Age "+age.get());
    }

}
