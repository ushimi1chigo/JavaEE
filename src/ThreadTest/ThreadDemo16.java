package ThreadTest;

import java.util.Vector;

public class ThreadDemo16 {
    static class Counter {
        public int count = 0;

        synchronized public void increase() {
            count++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    counter.increase();
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 50000; i++) {
                    counter.increase();
                }
            }
        };
            t1.start();
            t2.start();

            t1.join();
            t2.join();
        System.out.println(counter.count);
    }
}