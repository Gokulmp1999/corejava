package java8;

public class DiamondProblemMain implements DiamondProblem1,DiamondProblem2{

    public static void main(String[] args) {
        DiamondProblemMain main=new DiamondProblemMain();
        main.display();
    }
    @Override
    public void display() {
        System.out.println("hai");
    }
}
