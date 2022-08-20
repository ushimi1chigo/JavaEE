package ThreadTest;
class MyThread2 extends Thread{
    @Override
    public void run(){
        while (true){
        System.out.println("hello thread!");
        try {
            //让当前的线程暂时放弃CPU，等待一段时间之后，再重新参与调度
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        }
    }
}
public class ThreadDemo2 {
    public static void main(String[] args){
        Thread t = new MyThread2();
//        t.start();
        t.run();
        while (true){
            System.out.println("hello main");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
