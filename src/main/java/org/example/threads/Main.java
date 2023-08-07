package org.example.threads;

public class Main {
    public static void main(String[] args) {
//        A a=new A();
//        B b=new B();
//        C c=new C();
//        a.setPriority(Thread.MAX_PRIORITY);
//        a.start();
//        b.start();
//        c.start();
        AA aa=new AA();
        BB bb=new BB();
        Thread t1=new Thread(aa);
        Thread t2=new Thread(bb);
        t1.start();
        t2.start();

    }
}
