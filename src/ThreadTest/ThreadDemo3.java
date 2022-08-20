package ThreadTest;
class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("hello Runnable");
    }
}
public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
