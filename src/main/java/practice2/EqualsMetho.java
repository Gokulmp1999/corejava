package practice2;

public class EqualsMetho {
    @Override
    public boolean equals(Object obj) {
        return this.equals(obj);
    }

    public static void main(String[] args) {
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");
Sub sub=new Sub("g","mp");
Sub sub1=new Sub("g","mp");
        System.out.println(sub.last.equals(sub1.last));
//        System.out.println(s1 == s2); // true
//        System.out.println(s1 == s3); // false
//        System.out.println(s1.equals(s2)); // true
//        System.out.println(s1.equals(s3)); //
    }
}

class Sub{
    String name;
    String last;

    public Sub(String name, String last) {
        this.name = name;
        this.last = last;
    }
}
