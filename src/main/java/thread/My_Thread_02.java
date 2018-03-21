package thread;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author medo_zy
 * @Desciption:
 * @Date 2018-3-21 15:27
 */
public class My_Thread_02 extends Thread {
    @Override
    public void run(){
        try {
            for(int i=0;i<10;i++){
                int time = (int) (Math.random()*1000);
                Thread.sleep(time);
                System.out.println("run = "+Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
