package test;

import runnable.MyRuannable;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author medo_zy
 * @Desciption:
 * @Date 2018-3-21 15:36
 */
public class Run_02 {
    public static void main(String[] args) {
        Runnable runnable = new MyRuannable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束！");
    }
}
