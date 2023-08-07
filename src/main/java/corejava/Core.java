package corejava;

public class Core extends CoreSub{
    public static void main(String[] args) {
        Core c=new Core();
        c.display();
        c.show();
        showStatic();

        System.out.println(c.getClass());
    }
private void show(){
    System.out.println("show core");
}
    @Override
    public void display() {
        super.display();
        System.out.println("core display");
    }

    public static void showStatic(){
        System.out.println("showStatic core");
    }
}
class CoreSub{

    private void show(){
        System.out.println("show coresub");
    }
    public void display(){
        System.out.println("display coresub");
    }
    public static void showStatic(){
        System.out.println("showStatic CoreSub");
    }

}

