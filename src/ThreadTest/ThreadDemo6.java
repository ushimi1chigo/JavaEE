package ThreadTest;
public class ThreadDemo6 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println("hello thread");
        });
        t.start();
    }
}
