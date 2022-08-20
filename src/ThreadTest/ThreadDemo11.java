package ThreadTest;

public class ThreadDemo11 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(){
          @Override
          public void run(){
              int count = 0;
              while (count < 5){
                  count++;
                  System.out.println("线程运行中");
                  try {
                      sleep(1000);
                  } catch (InterruptedException e) {
                      throw new RuntimeException(e);
                  }
              }
              System.out.println("线程运行结束");
          }
        };
        t1.start();
        System.out.println("join开始执行");
        t1.join();
        System.out.println("join执行完毕");
    }
}
