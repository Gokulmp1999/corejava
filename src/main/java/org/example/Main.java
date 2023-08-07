package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
int a=10;
int b=10;
int num[]=new int[4];
String str="abc";
try {
    int c=a/b;
    if (c==1)
        throw new ArithmeticException();
    System.out.println(num[3]);
    System.out.println(str.length());
    int d=Integer.parseInt(str);
}catch (ArithmeticException arithmeticException){
    System.out.println(arithmeticException +" errors");
}catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
    System.out.println(arrayIndexOutOfBoundsException);
}catch (Throwable throwable){
    System.out.println(throwable);
}
        System.out.println("working");






    }
}