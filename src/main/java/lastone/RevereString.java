package lastone;

import java.util.Arrays;
import java.util.List;

public class RevereString {
    public static void main(String[] args) {
        String s="hai gokul mp";
        String[] c=s.split(" ");
//        List<String> c= Arrays.asList(s.split(" "));
        StringBuffer sb=new StringBuffer();
        for(int i=c.length-1;i>=0;i--){
            sb.append(c[i]+" ");
        }
        System.out.println(sb);
     }
}
