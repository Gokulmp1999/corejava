package serilizable;

import java.io.*;

class MyClass implements Serializable {
    private static int staticVar = 42;
    private int nonStaticVar;

    public MyClass(int nonStaticVar) {
        this.nonStaticVar = nonStaticVar;
    }

    public void printValues() {
        System.out.println("Static variable: " + staticVar);
        System.out.println("Non-static variable: " + nonStaticVar);
    }
}

public class SerializationExample {
    public static void main(String[] args) throws Exception {
        MyClass obj = new MyClass(10);

        // Serialize the object
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.ser"));
        out.writeObject(obj);
        out.close();

        // Deserialize the object
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.ser"));
        MyClass newObj = (MyClass) in.readObject();
        in.close();

        // Print values
        newObj.printValues(); // Static variable: 42 (unchanged), Non-static variable: 10
    }
}
