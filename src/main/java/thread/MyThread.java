package thread;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author medo_zy
 * @Desciption:
 * @Date 2018-3-21 15:24
 */
public class MyThread extends Thread {
    
    @Override
    public void run(){
        super.run();
        System.out.println("MyThread");
    }
}
