package thread;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author medo_zy
 * @Desciption:
 * @Date 2018-3-21 15:45
 */
public class My_Thread_04 extends Thread {
    
    private int count = 5;
    
    /*public My_Thread_04(String name){
        super();
        this.setName(name);
    }*/
//加锁后，将对象放入队列中，实现了线程安全
    @Override
     synchronized public void run() {
        super.run();
        count-- ;
        System.out.println("由"+Thread.currentThread().getName()+"计算，count = "+count);
    }
}
