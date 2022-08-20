package ThreadTest;

public class ThreadDemo10 {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                //默认情况下isInterrupted值为false
                while (!Thread.currentThread().isInterrupted()){
                    System.out.println("线程正在运行");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                    }
                }
            }
        };
        t.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //在主线程中通过t.interrupt()方法来设置标记位
        //这个方法把Thread.currentThread().isInterrupted() 给设成true
        t.interrupt();
    }
}
