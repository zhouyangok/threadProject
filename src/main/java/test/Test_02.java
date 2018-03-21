package test;

import thread.My_Thread_02;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author medo_zy
 * @Desciption:
 * @Date 2018-3-21 15:29
 */
public class Test_02 {
    public static void main(String[] args) {
        My_Thread_02 my_thread_02 = new My_Thread_02();
        my_thread_02.setName("myThread");
        my_thread_02.start();
        try {
            for(int i = 0;i<10;i++){
                int time = (int) (Math.random()*1000);
                my_thread_02.sleep(time);
                System.out.println("main = "+Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
       
    }
}
