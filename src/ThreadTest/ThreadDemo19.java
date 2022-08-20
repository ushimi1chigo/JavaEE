package ThreadTest;

public class ThreadDemo19 {
    static class waitTask implements Runnable{
        @Override
        public void run(){

        }
    }
    static class NotifyTask implements Runnable{
        @Override
        public void run(){

        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new waitTask());
        Thread t2 = new Thread(new NotifyTask());
    }
}
