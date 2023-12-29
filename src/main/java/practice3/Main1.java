package practice3;

public class Main1 extends Sub {
    public static void main(String[] args) {
        Main1 m=new Main1();
        m.printSub();
    }

    @Override
    public void printSub() {

        super.printSub();
    }
}

class Sub{
    public void printSub(){
        System.out.println("Sub class");
    }
}
