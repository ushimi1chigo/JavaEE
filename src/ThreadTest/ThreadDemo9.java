package ThreadTest;

public class ThreadDemo9 {
    private static boolean flag = true;
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while (flag){
                System.out.println("线程正在运行");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        t.start();
        Thread.sleep(3000);
        flag = false;
    }
}
