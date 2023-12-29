package HackerRank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
//        String smallest = "";
//        String largest = "";

        List<String> listString = new LinkedList<>();

        // listString.add(s.substring(0, 2));
        // System.out.println(listString);

//        int lengthOfString = s.length() - 1;
//        int end = lengthOfString - (k - 1);
//        for (int i = 0; i <= end; i++) {
//
//            listString.add(s.substring(i, k));
//            k++;
//        }
//        System.out.println(listString);

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String substr = s.substring(i, i + k);
            System.out.println("small  " +substr.compareTo(smallest));
            if (substr.compareTo(smallest) < 0) {
                smallest = substr;
            }
            System.out.println("lar  " +substr.compareTo(largest));
            if (substr.compareTo(largest) > 0) {
                largest = substr;
            }
        }


        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String s = scan.next();
//        int k = scan.nextInt();
//        scan.close();

        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }
}