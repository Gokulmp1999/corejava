package org.example.threads;

public class B extends Thread{
    public void show(){
        for (int i=0;i<=100;i++){
            System.out.println("b");
        }

    }
    public void run(){
        show();
    }
}
