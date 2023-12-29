package lastone;

public class RevereInt {
    public static void main(String[] args) {
        int a=123;
        int reversedNum = 0;

        while (a != 0) {
            int digit = a % 10;
            reversedNum = reversedNum * 10 + digit;
            a =a/10;
        }
        System.out.println(reversedNum);
    }
}
