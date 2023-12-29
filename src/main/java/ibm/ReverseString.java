package ibm;

import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        String s="Welcome gokul to the interview";
        String[] stringArray=s.split(" ");
        StringBuffer reversed =new StringBuffer();
        for (int i=stringArray.length-1;i>=0;i--){
            reversed.append(" "+stringArray[i]);
        }
        System.out.println(reversed);
    }
}
