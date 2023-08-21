package practice;

public interface A extends B{
   default void display(){
B.super.display();
       System.out.println("A");
   }
}
