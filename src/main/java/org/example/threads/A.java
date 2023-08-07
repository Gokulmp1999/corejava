package org.example.threads;

public class A extends Thread {
    public void show(){
        for (int i=0;i<=100;i++){
            System.out.println("a");
        }

    }
    public void run(){
        show();
    }
}
