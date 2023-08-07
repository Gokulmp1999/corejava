package org.example.threads;

public class AA implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<=50;i++){
            System.out.println("aa");
        }
    }
}
