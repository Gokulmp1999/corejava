package java8;

public class defaultMethodMain implements defaultMethodInterface {
    public static void main(String[] args) {
        defaultMethodMain defaultMethodMain = new defaultMethodMain();
        defaultMethodMain.display();
        defaultMethodMain.display2();
        System.out.println(defaultMethodMain.hashCode());

    }

    @Override
    public void display() {
        System.out.println("hai");
    }

    @Override
    public void display2() {
        System.out.println("hai display");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
