package ThreadTest;

public class ThreadDemo15 {
    static class Counter{
        public int count = 0;

        public void increase(){
            count++;
        }
    }
    static Counter counter = new Counter();
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(){
            @Override
            public void run(){
                int a = 0;
                for (int i = 0; i < 5_0000; i++) {
                    counter.increase();
                    a++;
                }
                System.out.println(a);
            }
        };
        t1.start();
        Thread t2 = new Thread(){
            @Override
            public void run(){
                int a = 0;
                for (int i = 0; i < 5_0000; i++) {
                    counter.increase();
                    a++;
                }
                System.out.println(a);
            }
        };
        t2.start();

        t1.join();
        t2.join();
        System.out.println(counter.count);
    }
}
