package ThreadTest;

public class ThreadDemo7 {
    static long count = 10_0000_0000L;
    //串行计时
    public static void serial(){
        long beg = System.currentTimeMillis();
        int a = 0;
        for (int i = 0; i < count; i++) {
            a++;
        }
        int b = 0;
        for (int i = 0; i < count; i++) {
            b++;
        }
        long end = System.currentTimeMillis();
        System.out.println("串行" + (end - beg));
    }
    //并发计时
    public static void serial2() throws InterruptedException {
        long beg = System.currentTimeMillis();
        Thread t = new Thread(){
            @Override
            public void run(){
                int a = 0;
                for (int i = 0; i < count; i++) {
                    a++;
                }
            }
        };
        t.start();
        Thread t1 = new Thread(){
            @Override
            public void run(){
                int b = 0;
                for (int i = 0; i < count; i++) {
                    b++;
                }
            }
        };
        t1.start();
        try{
            //join方法就是等待对应线程结束
            //当t1和t2没执行完之前，join方法就会阻塞等待
            t1.join();
            t.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("并发" +(end - beg));
    }
    public static void main(String[] args) throws InterruptedException {
        serial();
        serial2();

    }
}
