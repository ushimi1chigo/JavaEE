package ThreadTest;

public class Th {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(){
            @Override
            public void run(){
                for (int i = 0; i < 5; i++) {
                    System.out.println("interrupted "+Thread.currentThread().isInterrupted());
                }
            }
        };
        t.start();
        t.interrupt();
    }
}
