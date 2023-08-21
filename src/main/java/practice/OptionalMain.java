package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) throws Exception {
        String name=null;
        Optional<String> str=Optional.ofNullable(name);
//        if(str.isPresent()){
//            System.out.println("present");
//        }else{
//            System.out.println("not ");
//        }
        String result=str.orElseThrow(()->new Exception());
        System.out.println(result);
        System.out.println(name);
        String namee=null;
        if(namee!=null){
            System.out.println(namee);
        }else{
            System.out.println("not present");
        }
        Optional nameee=Optional.ofNullable(namee);
        if (nameee.isPresent()){
            System.out.println(nameee);
        }else {
            System.out.println("not present");
        }
    }
    public static Optional<String> randomString(){
        List<String> random= Arrays.asList("Gokul","mp","das");
        return random.stream().findAny();
    }
    public static void display(String name){
        System.out.println(name);
    }


}
