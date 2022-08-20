package ThreadTest;

public class ThreadDemo18 {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        synchronized (object) {
            System.out.println("wait前");
            object.wait();
            System.out.println("wait后");
        }
        Thread t1 =new Thread(){
            @Override
            public void run() {

            }
        };
    }
}
