package ThreadTest;

public class ThreadDemo8 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程ID" + Thread.currentThread().getId());
                System.out.println("线程优先级" + Thread.currentThread().getPriority());
                System.out.println("线程名称" + Thread.currentThread().getName());
                System.out.println("线程状态" + Thread.currentThread().getState());
                System.out.println("线程是否后台线程：" + Thread.currentThread().isDaemon());
                System.out.println("线程是否存活：" + Thread.currentThread().isAlive());
                System.out.println("线程是否被中断：" + Thread.currentThread().isInterrupted());
            }
        },"mythread");
        t.start();
    }
}
