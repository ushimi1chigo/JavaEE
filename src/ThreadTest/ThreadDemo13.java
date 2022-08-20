package ThreadTest;

public class ThreadDemo13 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(){
            @Override
            public void run(){
            }
        };
        System.out.println(t.getState());
        t.start();
        if(t.isAlive()){
            System.out.println(t.getState());
        }
        for (int i = 0; i < 10000000; i++) {
        }
        System.out.println(t.getState());
    }
}
