package org.example;

public class Switch {
    public static void main(String[] args) {
        String str="Appl";
        switch (str){
            case "Orange":
                System.out.println("orange");
                break;
            case "Apple":
                System.out.println("Apple");
                break;
            default:
                System.out.println("Not found");
        }
    }
}
