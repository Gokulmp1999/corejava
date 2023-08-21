package practice;

public class Ex {
    public void add(int a,int b){
        try {
            int c=a/b;
        }finally {
            System.out.println("finaly");
        }
        System.out.println("complete");
    }
}
