package ibm;

public class OuterClass {
    private int outerField;

    public static class StaticNestedClass {
        public static int nestedField;

        public void doSomething() {
            // Can access nestedField
        }
        public static void doSomethingWithStatic() {
            // Can access nestedField
        }
    }
}
class MainOuter{
    public static void main(String[] args) {
        OuterClass.StaticNestedClass.doSomethingWithStatic();
        OuterClass.StaticNestedClass.nestedField=20;

        OuterClass.StaticNestedClass staticNestedClass=new OuterClass.StaticNestedClass();
        staticNestedClass.doSomething();

    }
}
