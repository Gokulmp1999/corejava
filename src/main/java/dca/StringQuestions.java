package dca;

import java.util.*;
import java.util.stream.Collectors;

public class StringQuestions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter limit");
        int limit = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[limit];
        System.out.println("enter string");
        for (int i = 0; i <limit; i++) {
            strings[i] = scanner.nextLine();

        }
        List<String> listString=new ArrayList<>(Arrays.asList(strings));
        Comparator<String> comparator=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()>o2.length()){
                    return 1;
                }else {
                    return -1;
                }
            }
        };
        Collections.sort(listString,comparator);
        listString.stream().forEach(x-> System.out.println(x));
    }
}
