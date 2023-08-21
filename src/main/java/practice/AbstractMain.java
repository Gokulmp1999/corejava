package practice;

public class AbstractMain extends Sub {
    AbstractMain(int a) {
        super(a);
    }

    public static void main(String[] args) {
        AbstractMain abstractMain=new AbstractMain(5);
        abstractMain.display();
    }
}
