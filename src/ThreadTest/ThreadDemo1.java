package ThreadTest;
//Thread 是Java标准库中描述的一个关于线程的类
//常用的方式就是自己定义一个类继承Thread
//重写Thread中的run方法，run方法就表示线程要执行的具体任务(代码)
class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("hello thread");
    }
}
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t = new MyThread();
        //start方法，就会在操作系统中真的创建一个线程出来（内核中搞个PCB，加入到双线链表中)
        //这个新的线程，就会执行run中所描述的代码
        t.start();
    }
}
