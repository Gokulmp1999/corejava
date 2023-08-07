package org.example.threads;

public class C extends Thread{
    public void show(){
        for (int i=0;i<=100;i++){
            System.out.println("c");
        }

    }
    public void run(){
        show();
    }
}
