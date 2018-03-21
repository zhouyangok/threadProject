package test;

import thread.My_Thread_03;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author medo_zy
 * @Desciption:
 * @Date 2018-3-21 15:41
 */
public class Run_03 {
    
    public static void main(String[] args) {
        My_Thread_03 a = new My_Thread_03("A");
        My_Thread_03 b = new My_Thread_03("B");
        My_Thread_03 c = new My_Thread_03("C");

        a.start();
        b.start();
        c.start();
    }
  
    
}
