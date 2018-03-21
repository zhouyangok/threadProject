package test;

import thread.My_Thread_04;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author medo_zy
 * @Desciption:
 * @Date 2018-3-21 15:46
 */
public class Run_04 {
    public static void main(String[] args) {

        My_Thread_04 myThread = new My_Thread_04();
        Thread a = new Thread(myThread,"A");
        Thread b = new Thread(myThread,"B");
        Thread c = new Thread(myThread,"C");
        Thread d = new Thread(myThread,"D");
        Thread e = new Thread(myThread,"E");
        
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
