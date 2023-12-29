package practice2;

public class ReplaceInteger {
    public static void main(String[] args) {
        int a=122;
        int rev=0;
        while (a!=0){
            int d=a%10;
            rev=rev*10+d;
            rev=rev/10;
        }
        System.out.println(rev);

    }
}
