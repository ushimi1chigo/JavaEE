package ThreadTest;

public class ThreadDemo5 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello thread");
            }
        });
        t.start();
    }
}
