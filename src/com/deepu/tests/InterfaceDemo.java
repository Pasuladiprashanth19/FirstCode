package com.deepu.tests;
public class InterfaceDemo {
    public static void main(String[] args)throws Exception
    {
        Thread T1 =new Thread(() ->
        {
            for (int i =0;i<=5;i++) {
                System.out.println("hi "+ Thread.currentThread().getPriority());

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        });
        Thread T2 = new Thread(() ->
        {
            for (int i =0;i<=5;i++) {
                System.out.println("hello ");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        });
       T1.setPriority(Thread.MIN_PRIORITY);
       T2.setPriority(Thread.MAX_PRIORITY);

         T1.start();
        try {Thread.sleep(1000); }
        catch(Exception e){}
        T2.start();

        System.out.println(T1.isAlive());

        T1.join();
        T2.join();

        System.out.println("Bye");

    }
}
