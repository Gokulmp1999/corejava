package staticclass;

public class Outer {
    public String name;
    public static class Inner{
        public static void display(Outer outer){
            System.out.println("display from inner class" +outer.name);
        }
    }
    Outer(String name){
        this.name=name;
    }

//    public static void main(String[] args) {
//        Outer.Inner inner=new Outer.Inner();
//        inner.display();
//    }
}
class MainClass{
    public static void main(String[] args) {
        Outer outer=new Outer("gokul");
//        Outer.Inner inner=new Outer.Inner();
//        inner.display(outer);
        Outer.Inner.display(outer);

    }
}
