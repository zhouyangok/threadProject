package thread;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author medo_zy
 * @Desciption:
 * @Date 2018-3-21 15:38
 */
public class My_Thread_03 extends Thread {
    
    //不共享数据
    private int count = 5;
    
    public My_Thread_03(String name){
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count>0){
            count--;
            System.out.println("由"+Thread.currentThread().getName()+"计算，count="+count);
        }
    }
}
